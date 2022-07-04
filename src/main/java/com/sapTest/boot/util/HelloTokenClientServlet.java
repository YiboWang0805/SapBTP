package com.sapTest.boot.util;

import com.sap.cloud.security.config.Environments;
import com.sap.cloud.security.config.OAuth2ServiceConfiguration;
import com.sap.cloud.security.xsuaa.client.ClientCredentials;
import com.sap.cloud.security.xsuaa.client.DefaultOAuth2TokenService;
import com.sap.cloud.security.xsuaa.client.OAuth2TokenResponse;
import com.sap.cloud.security.xsuaa.client.XsuaaDefaultEndpoints;
import com.sap.cloud.security.xsuaa.tokenflows.XsuaaTokenFlows;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@WebServlet("/hello-token-client")
public class HelloTokenClientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");

        OAuth2ServiceConfiguration configuration = Environments.getCurrent().getXsuaaConfiguration();
        String clientSecret = configuration.getClientSecret();
        String clientid = configuration.getClientId();
        String url = configuration.getUrl().toString();

        XsuaaTokenFlows tokenFlows = new XsuaaTokenFlows(
                new DefaultOAuth2TokenService(),
                new XsuaaDefaultEndpoints(url), new ClientCredentials(clientid, clientSecret));
        OAuth2TokenResponse tokenResponse = tokenFlows.clientCredentialsTokenFlow().execute();

        writeLine(response, "Access-Token: " + tokenResponse.getAccessToken());
        writeLine(response, "Access-Token-Payload: " + tokenResponse.getDecodedAccessToken().getPayload());
        writeLine(response, "Expired-At: " + tokenResponse.getExpiredAtDate());

        log.info("Access-Token: " + tokenResponse.getAccessToken());
        log.info("Access-Token-Payload: " + tokenResponse.getDecodedAccessToken().getPayload());
        log.info("Expired-At: " + tokenResponse.getExpiredAtDate());
    }

    private void writeLine(HttpServletResponse response, String string) throws IOException {
        response.getWriter().append(string);
        response.getWriter().append("\n");
    }

}

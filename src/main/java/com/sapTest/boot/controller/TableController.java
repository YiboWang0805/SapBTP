package com.sapTest.boot.controller;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;

import com.fasterxml.jackson.jr.ob.JSON;
import com.mycompany.vdm.namespaces.portalapplicationscf.Application;
import com.mycompany.vdm.services.APIPortalApplicationsCFService;
import com.mycompany.vdm.services.DefaultAPIPortalApplicationsCFService;
import com.sap.cloud.sdk.cloudplatform.connectivity.*;
import com.sap.cloud.sdk.s4hana.connectivity.DefaultErpHttpDestination;
import com.sapTest.boot.bean.Book;
import com.sapTest.boot.service.BookService;
import com.sapTest.boot.util.RestUtil;
import io.vavr.control.Try;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

@Slf4j
@Controller
public class TableController {

    @Autowired
    BookService bookService;

    final String APIKey="p98wOfOjIHyGOV8APto2VGKhfBJJ6U3I";

    //API endpoint for API sandbox
    final String url = "https://sandbox.api.sap.com/sapapimanagement/apiportal/Management.svc/Applications";

    @GetMapping("/getData")
    public String getData(Model model){
        List<Book> books = bookService.getBook();
        model.addAttribute("books",books);
//        System.out.println(books.get(0).getAuthor());
        return "getData";
    }

    @RequestMapping(value = "/getApplications",method = RequestMethod.GET)
    public String getApplications(Model model) throws IOException {

        model.addAttribute("result",RestUtil.getMethod(url,APIKey));

        return "getApplications";

    }

    @RequestMapping (value = "/getApplications2",method = RequestMethod.GET)
    @ResponseBody
    public List<Application> getApplications2(Model model){

        log.info("getApplications2:========");
//        final DestinationOptions options =
//                DestinationOptions
//                        .builder()
//                        .augmentBuilder(
//                                ScpCfDestinationOptionsAugmenter.augmenter().retrievalStrategy(
//                                        ScpCfDestinationRetrievalStrategy.ALWAYS_PROVIDER))
//                        .build();
//        Try<Destination> tryDestination = DestinationAccessor.getLoader().tryGetDestination("MyDestination",options);
//        HttpDestination destination = tryDestination.get().asHttp().decorate(DefaultErpHttpDestination::new);
//        HttpDestination destination = DestinationAccessor.getDestination("MyDestination").asHttp();
//        log.info("destination:========"+destination.getUri());
//        log.info("destination:========"+destination.getAuthenticationType());
//        log.info("destination:========"+destination.getHeadersFromProperties());
//        log.info("destination:========"+destination.getHeaders(destination.getUri()));
        final HttpDestination destination = DestinationAccessor.getDestination("MyDestination").asHttp();

        APIPortalApplicationsCFService service = new DefaultAPIPortalApplicationsCFService();

        List<Application> result = service.getAllApplications()
                .executeRequest(destination);

        return result;
    }

    @RequestMapping (value = "/getApplications3",method = RequestMethod.GET)
    @ResponseBody
    public List<Application> getApplications3(Model model){
        log.info("getApplications3:========");

        final DestinationOptions options2 =
                DestinationOptions
                        .builder()
                        .augmentBuilder(
                                ScpCfDestinationOptionsAugmenter.augmenter().retrievalStrategy(
                                        ScpCfDestinationRetrievalStrategy.ALWAYS_PROVIDER))
                        .build();
        Try<Destination> destination = DestinationAccessor.getLoader().tryGetDestination("MyDestination", options2);
        HttpDestination httpDestination = destination.get().asHttp();

//        String destinationName = AccessTokenDestination.getDefaultName();
        log.info("getApplications2:========");
//
//        HttpDestination destination = DestinationAccessor.getDestination("MyDestination").asHttp();
        log.info("destination:========"+String.valueOf(httpDestination.getUri()));
        APIPortalApplicationsCFService service = new DefaultAPIPortalApplicationsCFService();


        List<Application> result = service.getAllApplications()
                .executeRequest(httpDestination);
//        model.addAttribute("result",result);
                return result;
    }
    @GetMapping(value = {"/index","/","index.html"})
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        modelAndView.addObject("name","Tom");
        return modelAndView;
    }

}

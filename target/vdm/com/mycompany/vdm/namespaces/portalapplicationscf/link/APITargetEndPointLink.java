
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf.link;

import javax.annotation.Nonnull;
import com.mycompany.vdm.namespaces.portalapplicationscf.APITargetEndPoint;
import com.mycompany.vdm.namespaces.portalapplicationscf.selectable.APITargetEndPointSelectable;
import com.sap.cloud.sdk.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmObject;


/**
 * Template class to represent entity navigation links of {@link com.mycompany.vdm.namespaces.portalapplicationscf.APITargetEndPoint APITargetEndPoint} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class APITargetEndPointLink<ObjectT extends VdmObject<?> >
    extends EntityLink<APITargetEndPointLink<ObjectT> , APITargetEndPoint, ObjectT>
    implements APITargetEndPointSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public APITargetEndPointLink(final String fieldName) {
        super(fieldName);
    }

    private APITargetEndPointLink(final EntityLink<APITargetEndPointLink<ObjectT> , APITargetEndPoint, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected APITargetEndPointLink<ObjectT> translateLinkType(final EntityLink<APITargetEndPointLink<ObjectT> , APITargetEndPoint, ObjectT> link) {
        return new APITargetEndPointLink<ObjectT>(link);
    }

}

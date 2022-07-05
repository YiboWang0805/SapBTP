
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf.link;

import javax.annotation.Nonnull;
import com.mycompany.vdm.namespaces.portalapplicationscf.APIProduct;
import com.mycompany.vdm.namespaces.portalapplicationscf.selectable.APIProductSelectable;
import com.sap.cloud.sdk.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmObject;


/**
 * Template class to represent entity navigation links of {@link com.mycompany.vdm.namespaces.portalapplicationscf.APIProduct APIProduct} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class APIProductLink<ObjectT extends VdmObject<?> >
    extends EntityLink<APIProductLink<ObjectT> , APIProduct, ObjectT>
    implements APIProductSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public APIProductLink(final String fieldName) {
        super(fieldName);
    }

    private APIProductLink(final EntityLink<APIProductLink<ObjectT> , APIProduct, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected APIProductLink<ObjectT> translateLinkType(final EntityLink<APIProductLink<ObjectT> , APIProduct, ObjectT> link) {
        return new APIProductLink<ObjectT>(link);
    }

}

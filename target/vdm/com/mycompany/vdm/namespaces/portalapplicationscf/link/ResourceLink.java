
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf.link;

import javax.annotation.Nonnull;
import com.mycompany.vdm.namespaces.portalapplicationscf.Resource;
import com.mycompany.vdm.namespaces.portalapplicationscf.selectable.ResourceSelectable;
import com.sap.cloud.sdk.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmObject;


/**
 * Template class to represent entity navigation links of {@link com.mycompany.vdm.namespaces.portalapplicationscf.Resource Resource} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class ResourceLink<ObjectT extends VdmObject<?> >
    extends EntityLink<ResourceLink<ObjectT> , Resource, ObjectT>
    implements ResourceSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public ResourceLink(final String fieldName) {
        super(fieldName);
    }

    private ResourceLink(final EntityLink<ResourceLink<ObjectT> , Resource, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected ResourceLink<ObjectT> translateLinkType(final EntityLink<ResourceLink<ObjectT> , Resource, ObjectT> link) {
        return new ResourceLink<ObjectT>(link);
    }

}
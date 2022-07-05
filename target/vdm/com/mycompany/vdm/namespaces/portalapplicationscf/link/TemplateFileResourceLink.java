
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.69.0
 */

package com.mycompany.vdm.namespaces.portalapplicationscf.link;

import javax.annotation.Nonnull;
import com.mycompany.vdm.namespaces.portalapplicationscf.TemplateFileResource;
import com.mycompany.vdm.namespaces.portalapplicationscf.selectable.TemplateFileResourceSelectable;
import com.sap.cloud.sdk.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmObject;


/**
 * Template class to represent entity navigation links of {@link com.mycompany.vdm.namespaces.portalapplicationscf.TemplateFileResource TemplateFileResource} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class TemplateFileResourceLink<ObjectT extends VdmObject<?> >
    extends EntityLink<TemplateFileResourceLink<ObjectT> , TemplateFileResource, ObjectT>
    implements TemplateFileResourceSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public TemplateFileResourceLink(final String fieldName) {
        super(fieldName);
    }

    private TemplateFileResourceLink(final EntityLink<TemplateFileResourceLink<ObjectT> , TemplateFileResource, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected TemplateFileResourceLink<ObjectT> translateLinkType(final EntityLink<TemplateFileResourceLink<ObjectT> , TemplateFileResource, ObjectT> link) {
        return new TemplateFileResourceLink<ObjectT>(link);
    }

}

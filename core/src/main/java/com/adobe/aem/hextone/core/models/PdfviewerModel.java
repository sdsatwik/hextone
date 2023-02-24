package com.adobe.aem.hextone.core.models;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = { SlingHttpServletRequest.class, Resource.class })
public class PdfviewerModel {
	   @Inject
	   private SlingHttpServletRequest request;
	   private String documentPath=StringUtils.EMPTY;
	   private String pdf="https://poc.prospectusexpress.aitglobalindia.com/v1/webversion/documents/pdf/";
	   public String getDocumentPath() {
	    	if(request.getParameter("value")!=null) {
	    		return pdf+request.getParameter("value");
	    	}
	        return documentPath;
	    }
}

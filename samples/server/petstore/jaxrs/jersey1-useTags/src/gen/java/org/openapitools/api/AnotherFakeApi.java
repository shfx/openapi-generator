package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AnotherFakeApiService;
import org.openapitools.api.factories.AnotherFakeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.sun.jersey.multipart.FormDataParam;
import javax.validation.constraints.*;

import org.openapitools.model.Client;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/AnotherFake")


@io.swagger.annotations.Api(description = "the AnotherFake API")

public class AnotherFakeApi  {
   private final AnotherFakeApiService delegate = AnotherFakeApiServiceFactory.getAnotherFakeApi();

    @PATCH
    @Path("/dummy")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "To test special tags", notes = "To test special tags", response = Client.class, tags={ "$another-fake?" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    public Response testSpecialTags(
        @ApiParam(value = "client model" ,required=true) Client client,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.testSpecialTags(client,securityContext);
    }
}

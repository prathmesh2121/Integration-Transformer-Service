package com.tibco.integration.transformer.controller;

import com.tibco.integration.transformer.service.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// REST Controller - Provides endpoints for bidirectional
// conversion of data formats.
@RestController
public class ConverterController
{

    @GetMapping("/health")
    public String health()
    {
        return ConversionService.health();
    }


    @PostMapping(value = "/json-to-xml", consumes = "application/json" , produces = "application/xml")
    public String jsonToXml(@RequestBody String json) throws Exception
    {
        return ConversionService.jsonToXml(json);
    }
    @PostMapping(value = "/xml-to-json", consumes = "application/xml" , produces = "application/json")
    public String xmlToJson(@RequestBody String xml) throws Exception
    {
        return ConversionService.xmlToJson(xml);
    }

}

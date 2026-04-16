package com.tibco.integration.transformer.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

// THIS SERVICE LAYER CONTAINS THE LOGIC FOR
// CONVERTING JSON TO XML AND XML TO JSON
@Service
public class ConversionService
{
    public static Logger logger = LoggerFactory.getLogger(ConversionService.class);

    public static String health()
    {
        return "Service is running...";
    }

    public static String jsonToXml(@RequestBody String json) throws Exception
    {
        logger.info("Received JSON: {} ", json);
        ObjectMapper jsonMapper = new ObjectMapper();
        Object obj = jsonMapper.readValue(json, Object.class);

        XmlMapper xmlMapper = new XmlMapper();
        System.out.println("JSON TO XML");
        return xmlMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(obj);
    }

    public static String xmlToJson(@RequestBody String xml) throws Exception
    {
        logger.info("Received XML: {} ",xml);
        XmlMapper xmlMapper = new XmlMapper();
        Object obj = xmlMapper.readValue(xml, Object.class);

        ObjectMapper jsonMapper = new ObjectMapper();

        return jsonMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(obj);
    }
}

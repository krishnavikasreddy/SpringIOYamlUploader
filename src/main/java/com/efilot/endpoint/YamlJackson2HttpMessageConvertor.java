/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.efilot.endpoint;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

final class YamlJackson2HttpMessageConverter extends 
        AbstractJackson2HttpMessageConverter {
    YamlJackson2HttpMessageConverter() {
         super(new YAMLMapper(), MediaType.parseMediaType("application/x-yaml"));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author Marcin
 */
public class ElementData {
    
    private final int id;               /* ID number */
    private final String name;          /* Default name */
    private final String name_en;       /* English name */
    private final String type;          /* Type of element */
    private final List <Long> nodes_list;   /* List of nodes */
    private long middle_node;               /* Central node */

    public ElementData(@JsonProperty("id") int id, @JsonProperty("name") String name, @JsonProperty("name_en") String name_en, @JsonProperty("type") String type, @JsonProperty("nodes_list") List<Long> nodes_list) {
        this.id = id;
        this.name = name;
        this.name_en = name_en;
        this.type = type;
        this.nodes_list = nodes_list;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getName_en() {
        return name_en;
    }

    public String getType() {
        return type;
    }

    public List<Long> getNodes_list() {
        return nodes_list;
    }

    public long getMiddle_node() {
        return middle_node;
    }

    public void setMiddle_node(long middle_node) {
        this.middle_node = middle_node;
    }
    
    
    
    
    
}

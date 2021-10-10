package com.example.restaurant.naver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchImageReq { //open api 요청변수에 해당하는 것들

    private String query = "";

    private int display = 1;

    private int start = 1;

    private String sort = "sim";

    private String filter = "all";

    public MultiValueMap<String, String> toMultiValueMap(){ //query parameter를 넣어서 미리 만들어두기 위함.
        var map = new LinkedMultiValueMap<String, String>();

        map.add("query",query);
        map.add("display",String.valueOf(display));
        map.add("start", String.valueOf(start));
        map.add("sort",sort);
        map.add("filter",filter);
        return map;
    }
}
package com.vucko.ttl;

import lombok.Data;

@Data
public class TraceInfo {

    private String traceId;

    private String spanId;

    private String name;

    private String parSpanId;

}

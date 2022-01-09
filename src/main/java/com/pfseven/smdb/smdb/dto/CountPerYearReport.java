package com.pfseven.smdb.smdb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CountPerYearReport {

    Long count;

    String year;
}

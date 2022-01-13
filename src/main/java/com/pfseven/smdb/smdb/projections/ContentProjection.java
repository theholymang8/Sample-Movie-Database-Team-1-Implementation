package com.pfseven.smdb.smdb.projections;

import java.math.BigDecimal;

public interface ContentProjection {

    Long getId();

    BigDecimal getBudget();

    String getCountryOfOrigin();

    String getDescription();

    String getLanguage();

    Integer getLength();

    Double getRating();

    String getReleaseDate();

    BigDecimal getRevenue();

    String getTitle();

}

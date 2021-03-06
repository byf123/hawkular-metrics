/*
 * Copyright 2014-2015 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hawkular.metrics.api.jaxrs.request;

import java.util.ArrayList;
import java.util.List;

import org.hawkular.metrics.api.jaxrs.model.Availability;
import org.hawkular.metrics.api.jaxrs.model.Gauge;

import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModel;

/**
 * @author Stefan Negrea
 */
@ApiModel
public class MixedMetricsRequest {

    private List<Gauge> gaugeMetrics = new ArrayList<>();
    private List<Availability> availabilityMetrics = new ArrayList<>();


    public List<Gauge> getGaugeMetrics() {
        return gaugeMetrics;
    }

    public void setGaugeMetric(List<Gauge> gaugeMetrics) {
        this.gaugeMetrics = gaugeMetrics;
    }

    public List<Availability> getAvailabilityMetrics() {
        return availabilityMetrics;
    }

    public void setAvailabilityMetrics(List<Availability> availabilityMetrics) {
        this.availabilityMetrics = availabilityMetrics;
    }


    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("guageMetrics", gaugeMetrics)
                .add("availibilityMetrics", availabilityMetrics)
                .toString();
    }
}

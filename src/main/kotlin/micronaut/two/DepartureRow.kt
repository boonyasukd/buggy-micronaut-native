package micronaut.two

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import io.micronaut.core.annotation.Introspected

@Introspected
@JsonIgnoreProperties(ignoreUnknown = true)
data class DepartureRow(
        var name: String = "",
        var departureDateTime: String = "",
        var departureReportDate: String = "",
        var source: String = "",
        var docNum: String = "",
        var address: String = "",
        var country: String = "")

package micronaut.two

import io.micronaut.http.annotation.*

@Controller("/invoices")
class InvoiceGenerator {

//    @Post("/generate")
//    fun generate(@Body departures: List<DepartureRow>): HttpResponse<ByteArray> {
//        return Class::class.java.getResourceAsStream("/invoices_template.xlsm").use {
//            val workbook = XSSFWorkbook(it)
//            val bytes = InvoiceExporter().exportAsBytes(workbook, departures)
//            val dateStr = departures[0].departureReportDate.take(7)
//
//            HttpResponse.ok(bytes)
//                    .contentType("application/vnd.ms-excel.sheet.macroEnabled.12")
//                    .header("Content-Disposition", "attachment; filename=\"invoices_$dateStr.xlsm\"")
//                    .header("Content-Length", bytes.size.toString())
//        }
//    }

    @Post("/generate")
    fun generate(@Body departures: List<DepartureRow>) = "data size: ${departures.size}"
}

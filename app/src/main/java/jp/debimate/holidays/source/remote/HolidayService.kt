package jp.debimate.holidays.source.remote

import io.reactivex.rxjava3.core.Single
import jp.debimate.holidays.domain.model.Holiday
import retrofit2.http.GET

interface HolidayService {
    @GET("{year}")
    fun getHolidaysInYear(): Single<List<Holiday>>
}
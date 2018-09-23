package ru.moex.moexapi

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.math.BigDecimal

data class Board(val history: History)

data class History(val metadata: Metadata,
                   val data: List<Data>,
                   val columns: List<String>)

class Metadata(val MARKETPRICE3TRADESVALUE: MARKETPRICE3TRADESVALUE,
               val NUMTRADES: NUMTRADES,
               val HIGH: HIGH,
               val BOARDID: BOARDID,
               val SHORTNAME: SHORTNAME,
               val ADMITTEDQUOTE: ADMITTEDQUOTE,
               val VOLUME: VOLUME,
               val WAPRICE: WAPRICE,
               val VALUE: VALUE,
               val CLOSE: CLOSE,
               val ADMITTEDVALUE: ADMITTEDVALUE,
               val TRADEDATE: TRADEDATE,
               val OPEN: OPEN,
               val LEGALCLOSEPRICE: LEGALCLOSEPRICE,
               val LOW: LOW,
               val MP2VALTRD: MP2VALTRD,
               val MARKETPRICE2: MARKETPRICE2,
               val SECID: SECID,
               val MARKETPRICE3: MARKETPRICE3,
               val WAVAL: WAVAL)

//@JsonPropertyOrder(
//        "BOARDID",
//        "TRADEDATE",
//        "SHORTNAME",
//        "SECID",
//        "NUMTRADES",
//        "VALUE",
//        "OPEN",
//        "LOW",
//        "HIGH",
//        "LEGALCLOSEPRICE",
//        "WAPRICE",
//        "CLOSE",
//        "VOLUME",
//        "MARKETPRICE2",
//        "MARKETPRICE3",
//        "ADMITTEDQUOTE",
//        "MP2VALTRD",
//        "MARKETPRICE3TRADESVALUE",
//        "ADMITTEDVALUE",
//        "WAVAL"
//)

@JsonFormat(shape = JsonFormat.Shape.ARRAY)
data class Data(
        var BOARDID: String?,
        var TRADEDATE: String?,
        var SHORTNAME: String?,
        var SECID: String?,
        var NUMTRADES: BigDecimal?,
        var VALUE: BigDecimal?,
        var OPEN: BigDecimal?,
        var LOW: BigDecimal?,
        var HIGH: BigDecimal?,
        var LEGALCLOSEPRICE: BigDecimal?,
        var WAPRICE: BigDecimal?,
        var CLOSE: BigDecimal?,
        var VOLUME: BigDecimal?,
        var MARKETPRICE2: BigDecimal?,
        var MARKETPRICE3: BigDecimal?,
        var ADMITTEDQUOTE: BigDecimal?,
        var MP2VALTRD: BigDecimal?,
        var MARKETPRICE3TRADESVALUE: BigDecimal?,
        var ADMITTEDVALUE: BigDecimal?,
        var WAVAL: BigDecimal?
)

class MARKETPRICE3TRADESVALUE(val type: String)

class NUMTRADES(val type: String)

class HIGH(val type: String)

class BOARDID(val bytes: Int,
              val type: String,
              val max_size: Int)

class SHORTNAME(val bytes: Int,
                val type: String,
                val max_size: Int)

class ADMITTEDQUOTE(val type: String)

class VOLUME(val type: String)

class WAPRICE(val type: String)

class VALUE(val type: String)

class CLOSE(val type: String)

class ADMITTEDVALUE(val type: String)

class TRADEDATE(val bytes: Int,
                val type: String,
                val max_size: Int)

class OPEN(val type: String)

class LEGALCLOSEPRICE(val type: String)

class LOW(val type: String)

class MP2VALTRD(val type: String)

class MARKETPRICE2(val type: String)

class SECID(val bytes: Int,
            val type: String,
            val max_size: Int)

class MARKETPRICE3(val type: String)

class WAVAL(val type: String)


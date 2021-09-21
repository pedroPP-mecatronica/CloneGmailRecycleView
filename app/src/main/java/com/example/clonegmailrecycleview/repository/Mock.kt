package com.example.clonegmailrecycleview.repository

data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val unreand: Boolean,
    val started: Boolean,
    var selected: Boolean = false
)

class EmailBuilder {
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var unreand: Boolean = false
    var started: Boolean = false
    fun build(): Email = Email(user, subject, preview, date, started, unreand, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()


fun fakeEmails():MutableList<Email> = mutableListOf(
    email {
        user = "FaceBook"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "15 jul"
        started = false
    },
    email {
        user = "TikTok"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "09 set"
        started = false
    },
    email {
        user = "TikTok"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "16 dez"
        started = false
    },
    email {
        user = "Avon"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "30 jun"
        started = true
        unreand = true
    },
    email {
        user = "Mercado Livre"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "25 mai"
        started = false
    },
    email {
        user = "Instagram"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "19 set"
        started = false
    },
    email {
        user = "Google"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "30 jun"
        started = false
    },
    email {
        user = "FaceBook"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "19 fev"
        started = false
    },
    email {
        user = "Avon"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "30 jun"
        started = true
        unreand = true
    },
    email {
        user = "Mercado Livre"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "21 abr"
        started = false
    },
    email {
        user = "Instagram"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "02 jan"
        started = false
    },email {
        user = "FaceBook"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "15 jul"
        started = false
    },
    email {
        user = "TikTok"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "09 set"
        started = false
    },
    email {
        user = "TikTok"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "16 dez"
        started = false
    },
    email {
        user = "Avon"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "30 jun"
        started = true
        unreand = true
    },
    email {
        user = "Mercado Livre"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "25 mai"
        started = false
    },
    email {
        user = "Instagram"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "19 set"
        started = false
    },
    email {
        user = "Google"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "30 jun"
        started = false
    },
    email {
        user = "FaceBook"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "19 fev"
        started = false
    },
    email {
        user = "Avon"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "30 jun"
        started = true
        unreand = true
    },
    email {
        user = "Mercado Livre"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "21 abr"
        started = false
    },
    email {
        user = "Instagram"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "02 jan"
        started = false
    },
    email {
        user = "FaceBook"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "15 jul"
        started = false
    },
    email {
        user = "TikTok"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "09 set"
        started = false
    },
    email {
        user = "TikTok"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "16 dez"
        started = false
    },
    email {
        user = "Avon"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "30 jun"
        started = true
        unreand = true
    },
    email {
        user = "Mercado Livre"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "25 mai"
        started = false
    },
    email {
        user = "Instagram"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "19 set"
        started = false
    },
    email {
        user = "Google"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "30 jun"
        started = false
    },
    email {
        user = "FaceBook"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "19 fev"
        started = false
    },
    email {
        user = "Avon"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "30 jun"
        started = true
        unreand = true
    },
    email {
        user = "Mercado Livre"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "21 abr"
        started = false
    },
    email {
        user = "Instagram"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "02 jan"
        started = false
    },email {
        user = "FaceBook"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "15 jul"
        started = false
    },
    email {
        user = "TikTok"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "09 set"
        started = false
    },
    email {
        user = "TikTok"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "16 dez"
        started = false
    },
    email {
        user = "Avon"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "30 jun"
        started = true
        unreand = true
    },
    email {
        user = "Mercado Livre"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "25 mai"
        started = false
    },
    email {
        user = "Instagram"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "19 set"
        started = false
    },
    email {
        user = "Google"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "30 jun"
        started = false
    },
    email {
        user = "FaceBook"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "19 fev"
        started = false
    },
    email {
        user = "Avon"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "30 jun"
        started = true
        unreand = true
    },
    email {
        user = "Mercado Livre"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "21 abr"
        started = false
    },
    email {
        user = "Instagram"
        subject = "veja nossas três dicas principais para você conseguir a vaga"
        preview =
            "Olá, Pedro, precisamo que cadastre-se no curso de Kotlin e tirar o certificado de desenvolvedor "
        date = "02 jan"
        started = false
    }
)
package it.eng.parerxml.xsd;

/**
 *
 * @author Moretti_Lu
 */
public enum FileXSD {
    VERS_REQ_STATO_XSD("/it/eng/parer/ws/xml/versReqStato/WSRequestStato_1.2.xsd"), //
    VERS_REQ_STATO_MM_XSD("/it/eng/parer/ws/xml/versReqStatoMM/WSRequestStatoMM.xsd"), //
    VERS_RESP_STATO_XSD("/it/eng/parer/ws/xml/versRespStato/WSResponseStato.xsd"),

    ANNULLA_VERS_REQ_XSD("/it/eng/parer/ws/xml/annullamento/WSRichAnnullVers.xsd"), //
    ANNULLA_VERS_RESP_XSD("/it/eng/parer/ws/xml/annullamento/WSEsitoRichAnnullVers.xsd"),

    CREAZIONE_ELENCO_VERSAMENTO_XSD("/it/eng/parer/elenco/xml/indice/indice_elencoversamento2.0.xsd"),

    INDICE_VOLUME_SERIE_XSD("/it/eng/parer/serie/xml/indiceVolumeSerie/IndiceVolumeSerie.xsd"),

    UNISINCRO_2_XSD("/it/eng/parer/ws/xml/usmainResp/Unisincro_vers.02.xsd"),

    AIP_UD_DOC_XSD("/it/eng/parer/ws/xml/usdocResp/Unisincro_MoreInfoDoc_v1.1.xsd"), //
    AIP_UD_FILE_XSD("/it/eng/parer/ws/xml/usfileResp/Unisincro_MoreInfoFile_v1.1.xsd"), //
    AIP_UD_SELF_DESCRIPTION_XSD("/it/eng/parer/ws/xml/usselfdescResp/Unisincro_MoreInfoSelfDescription_v1.1.xsd"), //
    AIP_UD_VDC_XSD("/it/eng/parer/ws/xml/usvdcResp/Unisincro_MoreInfoVdC_v1.1.xsd"),

    // EVO#20972
    UNISINCRO_2_XSD_V2("/it/eng/parer/ws/xml/usmainRespV2/Unisincro_PIndex.xsd"), //
    AIP_UD_SELF_DESCRIPTION_XSD_V2("/it/eng/parer/ws/xml/usselfdescRespV2/Unisincro_MoreInfoSelfDescription_v2.0.xsd"), //
    AIP_UD_PVOLUME_XSD_V2("/it/eng/parer/ws/xml/uspvolumeRespV2/Unisincro_MoreInfoPVolume_v2.0.xsd"),
    // end EVO#20972

    AIP_SERIE_FILE_XSD("/it/eng/parer/serie/xml/serfileResp/IndiceAIPSerie_MoreInfo_File_v1.0.xsd"), //
    AIP_SERIE_PROD_XSD("/it/eng/parer/serie/xml/serprodResp/IndiceAIPSerie_MoreInfo_Producer_v1.0.xsd"), //
    AIP_SERIE_SELF_DESC_XSD(
            "/it/eng/parer/serie/xml/serselfdescResp/IndiceAIPSerieUd_MoreInfo_SelfDescription_v1.0.xsd"), //
    AIP_SERIE_VDC_XSD("/it/eng/parer/serie/xml/servdcResp/IndiceAIPSerie_MoreInfo_VdC_v1.0.xsd"),

    CREAZIONE_ELENCO_INDICE_AIP_XSD("/it/eng/parer/elenco/xml/aip/ElencoIndiciAIP.xsd"),

    AIP_FASC_UNISINCRO_2_XSD("/it/eng/parer/aipFascicoli/xml/usmainResp/Unisincro_vers.02.xsd"), //
    AIP_FASC_PROF_XSD("/it/eng/parer/aipFascicoli/xml/usprofascResp/ProfiloCompletoFascicolo_1.0.xsd"), //
    AIP_FASC_SELF_DESC_XSD("/it/eng/parer/aipFascicoli/xml/usselfdescResp/Unisincro_MoreInfoSelfDescription_v1.0.xsd"),

    VERS_REQ_XSD("/it/eng/parer/ws/xml/versReq/WSRequestVersamento.xsd"), //
    VERS_RESP_XSD("/it/eng/parer/ws/xml/versResp/WSResponseVersamento.xsd"), //
    AGG_VERS_REQ_XSD("/it/eng/parer/ws/xml/versAggiornamentoReq/WSRequestAggiornamentoVersamento_1.4.xsd"), //
    AGG_VERS_RESP_XSD("it/eng/parer/ws/xml/versAggiornamentoResp/WSResponseAggiornamentoVersamento_1.4.xsd");

    private final String filename;

    FileXSD(String filename) {
        this.filename = filename;
    }

    String getFilename() {
        return filename;
    }
}

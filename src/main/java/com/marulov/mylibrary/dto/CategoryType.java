package com.marulov.mylibrary.dto;

public enum CategoryType {
    RESEARCH_HISTORY("Arastirma - Tarih"),
    SCIENCE("Bilim"),
    COMIC("Cizgi Roman"),
    CHILD_AND_YOUTH("Cocuk ve Genclik"),
    LESSON_TEST_BOOKS("Ders / Sinav Kitaplari"),
    RELIGION("Din"),
    LITERATURE("Edebiyat"),
    EDUCATION_REFERENCE("Egitim - Referans"),
    PHILOSOPHY("Felsefe"),
    FOREIGN_LANGUAGE("Yabanci Dil"),
    HOBBY("Hobi"),
    MYTHOLOGY("Mitoloji"),
    RUMOR("Mizah"),
    PRESTIGE_BOOKS("Prestij Kitaplari"),
    ART_DESIGN("Sanat - Tasarim"),
    AUDIO_BOOKS("Sesli Kitaplar"),
    OTHER("Diger");

    private final String value;

    CategoryType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
package com.marulov.mylibrary.dto;

public enum CategoryType {
    RESEARCH_HISTORY("Araştırma - Tarih"),
    SCIENCE("Bilim"),
    COMIC("Çizgi Roman"),
    CHILD_AND_YOUTH("Çocuk ve Gençlik"),
    LESSON_TEST_BOOKS("Ders / Sınav Kitapları"),
    RELIGION("Din"),
    LITERATURE("Edebiyat"),
    EDUCATION_REFERENCE("Eğitim - Referans"),
    PHILOSOPHY("Felsefe"),
    FOREIGN_LANGUAGE("Yabancı Dil"),
    HOBBY("Hobi"),
    MYTHOLOGY("Mitoloji"),
    RUMOR("Mizah"),
    PRESTIGE_BOOKS("PRESTİJ Kitapları"),
    ART_DESIGN("Sanat - Tasarım"),
    AUDIO_BOOKS("Sesli Kitaplar"),
    OTHER("Diğer");

    private final String value;

    CategoryType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
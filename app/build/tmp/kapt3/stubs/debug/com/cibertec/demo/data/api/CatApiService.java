package com.cibertec.demo.data.api;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J2\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\r\u00c0\u0006\u0003"}, d2 = {"Lcom/cibertec/demo/data/api/CatApiService;", "", "getAllBreeds", "Lretrofit2/Call;", "", "Lcom/cibertec/demo/entity/CatBreed;", "apiKey", "", "getImagesByBreed", "Lcom/cibertec/demo/entity/CatImage;", "breedId", "limit", "", "app_debug"})
public abstract interface CatApiService {
    
    @retrofit2.http.GET(value = "breeds")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<java.util.List<com.cibertec.demo.entity.CatBreed>> getAllBreeds(@retrofit2.http.Header(value = "x-api-key")
    @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey);
    
    @retrofit2.http.GET(value = "images/search")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<java.util.List<com.cibertec.demo.entity.CatImage>> getImagesByBreed(@retrofit2.http.Query(value = "breed_ids")
    @org.jetbrains.annotations.NotNull()
    java.lang.String breedId, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Header(value = "x-api-key")
    @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey);
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}
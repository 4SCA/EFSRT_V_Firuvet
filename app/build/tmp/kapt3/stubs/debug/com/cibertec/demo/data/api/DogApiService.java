package com.cibertec.demo.data.api;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t\u00c0\u0006\u0003"}, d2 = {"Lcom/cibertec/demo/data/api/DogApiService;", "", "getAllBreeds", "Lretrofit2/Call;", "Lcom/cibertec/demo/entity/DogBreedsResponse;", "getRandomImageByBreed", "Lcom/cibertec/demo/entity/DogImageResponse;", "breed", "", "app_debug"})
public abstract interface DogApiService {
    
    @retrofit2.http.GET(value = "breeds/list/all")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.cibertec.demo.entity.DogBreedsResponse> getAllBreeds();
    
    @retrofit2.http.GET(value = "breed/{breed}/images/random")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.cibertec.demo.entity.DogImageResponse> getRandomImageByBreed(@retrofit2.http.Path(value = "breed")
    @org.jetbrains.annotations.NotNull()
    java.lang.String breed);
}
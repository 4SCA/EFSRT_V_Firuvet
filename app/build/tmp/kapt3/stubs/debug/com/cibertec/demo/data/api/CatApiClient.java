package com.cibertec.demo.data.api;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/cibertec/demo/data/api/CatApiClient;", "", "<init>", "()V", "BASE_URL", "", "API_KEY", "getAPI_KEY", "()Ljava/lang/String;", "client", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "apiService", "Lcom/cibertec/demo/data/api/CatApiService;", "getApiService", "()Lcom/cibertec/demo/data/api/CatApiService;", "apiService$delegate", "Lkotlin/Lazy;", "app_debug"})
public final class CatApiClient {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "https://api.thecatapi.com/v1/";
    private static final okhttp3.OkHttpClient client = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy apiService$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.cibertec.demo.data.api.CatApiClient INSTANCE = null;
    
    private CatApiClient() {
        super();
    }
    
    private final java.lang.String getAPI_KEY() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.cibertec.demo.data.api.CatApiService getApiService() {
        return null;
    }
}
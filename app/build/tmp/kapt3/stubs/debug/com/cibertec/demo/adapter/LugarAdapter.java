package com.cibertec.demo.adapter;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/cibertec/demo/adapter/LugarAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/cibertec/demo/adapter/LugarAdapter$LugarViewHolder;", "listaLugares", "", "Lcom/cibertec/demo/entity/Lugar;", "<init>", "(Ljava/util/List;)V", "updateLista", "", "nuevaLista", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "LugarViewHolder", "app_debug"})
public final class LugarAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.cibertec.demo.adapter.LugarAdapter.LugarViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.cibertec.demo.entity.Lugar> listaLugares;
    
    public LugarAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.cibertec.demo.entity.Lugar> listaLugares) {
        super();
    }
    
    public final void updateLista(@org.jetbrains.annotations.NotNull()
    java.util.List<com.cibertec.demo.entity.Lugar> nuevaLista) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.cibertec.demo.adapter.LugarAdapter.LugarViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.cibertec.demo.adapter.LugarAdapter.LugarViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/cibertec/demo/adapter/LugarAdapter$LugarViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "tvNombre", "Landroid/widget/TextView;", "getTvNombre", "()Landroid/widget/TextView;", "tvDistancia", "getTvDistancia", "ivCitar", "Landroid/widget/ImageView;", "getIvCitar", "()Landroid/widget/ImageView;", "app_debug"})
    public static final class LugarViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvNombre = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvDistancia = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivCitar = null;
        
        public LugarViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvNombre() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvDistancia() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvCitar() {
            return null;
        }
    }
}
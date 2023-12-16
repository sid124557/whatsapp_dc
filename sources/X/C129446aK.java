package X;

/* renamed from: X.6aK  reason: invalid class name and case insensitive filesystem */
public final class C129446aK extends AnonymousClass8TH<K, V, K> {
    public final /* synthetic */ AnonymousClass8TE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129446aK(AnonymousClass8TE r1) {
        super(r1);
        this.this$0 = r1;
    }

    public boolean contains(Object obj) {
        return this.this$0.containsKey(obj);
    }

    public Object forEntry(int i) {
        return this.this$0.keys[i];
    }

    public boolean remove(Object obj) {
        int smearedHash = C159347lg.smearedHash(obj);
        int findEntryByKey = this.this$0.findEntryByKey(obj, smearedHash);
        if (findEntryByKey == -1) {
            return false;
        }
        this.this$0.removeEntryKeyHashKnown(findEntryByKey, smearedHash);
        return true;
    }
}

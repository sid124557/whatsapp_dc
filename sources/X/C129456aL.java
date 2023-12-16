package X;

/* renamed from: X.6aL  reason: invalid class name and case insensitive filesystem */
public final class C129456aL extends AnonymousClass8TH<K, V, V> {
    public final /* synthetic */ AnonymousClass8TE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129456aL(AnonymousClass8TE r1) {
        super(r1);
        this.this$0 = r1;
    }

    public boolean contains(Object obj) {
        return this.this$0.containsValue(obj);
    }

    public Object forEntry(int i) {
        return this.this$0.values[i];
    }

    public boolean remove(Object obj) {
        int smearedHash = C159347lg.smearedHash(obj);
        int findEntryByValue = this.this$0.findEntryByValue(obj, smearedHash);
        if (findEntryByValue == -1) {
            return false;
        }
        this.this$0.removeEntryValueHashKnown(findEntryByValue, smearedHash);
        return true;
    }
}

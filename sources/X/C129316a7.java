package X;

/* renamed from: X.6a7  reason: invalid class name and case insensitive filesystem */
public final class C129316a7 extends AnonymousClass8ON {
    public int index;
    public final Object key;
    public final /* synthetic */ AnonymousClass8TE this$0;

    public C129316a7(AnonymousClass8TE r2, int i) {
        this.this$0 = r2;
        this.key = r2.keys[i];
        this.index = i;
    }

    public Object getKey() {
        return this.key;
    }

    public void updateIndex() {
        int i = this.index;
        if (i != -1) {
            AnonymousClass8TE r1 = this.this$0;
            if (i <= r1.size && C1447372t.A00(r1.keys[i], this.key)) {
                return;
            }
        }
        this.index = this.this$0.findEntryByKey(this.key);
    }

    public Object getValue() {
        updateIndex();
        int i = this.index;
        if (i == -1) {
            return C1447472u.unsafeNull();
        }
        return this.this$0.values[i];
    }

    public Object setValue(Object obj) {
        updateIndex();
        int i = this.index;
        if (i == -1) {
            this.this$0.put(this.key, obj);
            return C1447472u.unsafeNull();
        }
        Object obj2 = this.this$0.values[i];
        if (C1447372t.A00(obj2, obj)) {
            return obj;
        }
        this.this$0.replaceValueInEntry(this.index, obj, false);
        return obj2;
    }
}

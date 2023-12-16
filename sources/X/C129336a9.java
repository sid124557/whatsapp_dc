package X;

/* renamed from: X.6a9  reason: invalid class name and case insensitive filesystem */
public final class C129336a9 extends AnonymousClass8ON {
    public final AnonymousClass8TE biMap;
    public int index;
    public final Object value;

    private void updateIndex() {
        int i = this.index;
        if (i != -1) {
            AnonymousClass8TE r2 = this.biMap;
            if (i <= r2.size && C1447372t.A00(this.value, r2.values[i])) {
                return;
            }
        }
        this.index = this.biMap.findEntryByValue(this.value);
    }

    public Object getKey() {
        return this.value;
    }

    public C129336a9(AnonymousClass8TE r2, int i) {
        this.biMap = r2;
        this.value = r2.values[i];
        this.index = i;
    }

    public Object getValue() {
        updateIndex();
        int i = this.index;
        if (i == -1) {
            return C1447472u.unsafeNull();
        }
        return this.biMap.keys[i];
    }

    public Object setValue(Object obj) {
        updateIndex();
        int i = this.index;
        if (i == -1) {
            this.biMap.putInverse(this.value, obj, false);
            return C1447472u.unsafeNull();
        }
        Object obj2 = this.biMap.keys[i];
        if (C1447372t.A00(obj2, obj)) {
            return obj;
        }
        this.biMap.replaceKeyInEntry(this.index, obj, false);
        return obj2;
    }
}

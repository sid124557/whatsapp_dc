package X;

import java.util.Map;

/* renamed from: X.6a8  reason: invalid class name and case insensitive filesystem */
public final class C129326a8 extends AnonymousClass8ON {
    public final Object key;
    public int lastKnownIndex;
    public final /* synthetic */ AnonymousClass8TF this$0;

    public C129326a8(AnonymousClass8TF r2, int i) {
        this.this$0 = r2;
        this.key = r2.key(i);
        this.lastKnownIndex = i;
    }

    private void updateLastKnownIndex() {
        int i = this.lastKnownIndex;
        if (i == -1 || i >= this.this$0.size() || !C1447372t.A00(this.key, this.this$0.key(this.lastKnownIndex))) {
            this.lastKnownIndex = this.this$0.indexOf(this.key);
        }
    }

    public Object getKey() {
        return this.key;
    }

    public Object getValue() {
        Map delegateOrNull = this.this$0.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(this.key);
        }
        updateLastKnownIndex();
        int i = this.lastKnownIndex;
        if (i == -1) {
            return C1447472u.unsafeNull();
        }
        return this.this$0.value(i);
    }

    public Object setValue(Object obj) {
        Map delegateOrNull = this.this$0.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.put(this.key, obj);
        }
        updateLastKnownIndex();
        int i = this.lastKnownIndex;
        if (i == -1) {
            this.this$0.put(this.key, obj);
            return C1447472u.unsafeNull();
        }
        Object access$600 = this.this$0.value(i);
        this.this$0.setValue(this.lastKnownIndex, obj);
        return access$600;
    }
}

package X;

/* renamed from: X.6au  reason: invalid class name and case insensitive filesystem */
public class C129806au extends C153177an {
    public final Object key;
    public int lastKnownIndex;
    public final /* synthetic */ C162347rk this$0;

    public C129806au(C162347rk r2, int i) {
        this.this$0 = r2;
        this.key = r2.keys[i];
        this.lastKnownIndex = i;
    }

    public Object getElement() {
        return this.key;
    }

    public void updateLastKnownIndex() {
        int i = this.lastKnownIndex;
        if (i != -1) {
            C162347rk r2 = this.this$0;
            if (i < r2.size() && C1447372t.A00(this.key, r2.keys[i])) {
                return;
            }
        }
        this.lastKnownIndex = this.this$0.indexOf(this.key);
    }

    public int getCount() {
        updateLastKnownIndex();
        int i = this.lastKnownIndex;
        if (i == -1) {
            return 0;
        }
        return this.this$0.values[i];
    }
}

package X;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.8P8  reason: invalid class name */
public final class AnonymousClass8P8 implements AnonymousClass66R, Serializable {
    public static final AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass8P8.class, Object.class, "_value");
    public volatile Object _value;

    /* renamed from: final  reason: not valid java name */
    public final Object f14final;
    public volatile AnonymousClass4GP initializer;

    public boolean BHk() {
        return C18300x5.A1W(this._value, C155197eR.A00);
    }

    public Object getValue() {
        Object obj = this._value;
        C155197eR r1 = C155197eR.A00;
        if (obj == r1) {
            AnonymousClass4GP r0 = this.initializer;
            if (r0 != null) {
                obj = r0.invoke();
                if (AnonymousClass0H6.A00(this, r1, obj, A00)) {
                    this.initializer = null;
                }
            }
            return this._value;
        }
        return obj;
    }

    public AnonymousClass8P8(AnonymousClass4GP r2) {
        this.initializer = r2;
        C155197eR r0 = C155197eR.A00;
        this._value = r0;
        this.f14final = r0;
    }

    private final Object writeReplace() {
        return new AnonymousClass8P5(getValue());
    }

    public String toString() {
        if (BHk()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}

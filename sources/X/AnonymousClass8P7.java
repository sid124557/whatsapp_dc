package X;

import java.io.Serializable;

/* renamed from: X.8P7  reason: invalid class name */
public final class AnonymousClass8P7 implements AnonymousClass66R, Serializable {
    public volatile Object _value = C155197eR.A00;
    public AnonymousClass4GP initializer;
    public final Object lock = this;

    public static AnonymousClass8P7 A00(AnonymousClass4GP r1) {
        return new AnonymousClass8P7(r1);
    }

    public boolean BHk() {
        return C18300x5.A1W(this._value, C155197eR.A00);
    }

    public Object getValue() {
        Object obj;
        Object obj2 = this._value;
        C155197eR r0 = C155197eR.A00;
        if (obj2 != r0) {
            return obj2;
        }
        synchronized (this.lock) {
            obj = this._value;
            if (obj == r0) {
                AnonymousClass4GP r02 = this.initializer;
                C162457s7.A0H(r02);
                obj = r02.invoke();
                this._value = obj;
                this.initializer = null;
            }
        }
        return obj;
    }

    public AnonymousClass8P7(AnonymousClass4GP r2) {
        this.initializer = r2;
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

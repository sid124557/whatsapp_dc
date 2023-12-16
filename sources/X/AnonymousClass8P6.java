package X;

import java.io.Serializable;

/* renamed from: X.8P6  reason: invalid class name */
public final class AnonymousClass8P6 implements AnonymousClass66R, Serializable {
    public Object _value = C155197eR.A00;
    public AnonymousClass4GP initializer;

    public boolean BHk() {
        return C18300x5.A1W(this._value, C155197eR.A00);
    }

    public Object getValue() {
        Object obj = this._value;
        if (obj != C155197eR.A00) {
            return obj;
        }
        AnonymousClass4GP r0 = this.initializer;
        C162457s7.A0H(r0);
        Object invoke = r0.invoke();
        this._value = invoke;
        this.initializer = null;
        return invoke;
    }

    public AnonymousClass8P6(AnonymousClass4GP r2) {
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

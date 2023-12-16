package X;

import java.io.Serializable;

/* renamed from: X.6aw  reason: invalid class name and case insensitive filesystem */
public final class C129826aw extends AnonymousClass8NS implements Serializable {
    public static final long serialVersionUID = 0;
    public final AnonymousClass8NS forwardOrder;

    public int compare(Object obj, Object obj2) {
        return this.forwardOrder.compare(obj2, obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C129826aw) {
            return this.forwardOrder.equals(((C129826aw) obj).forwardOrder);
        }
        return false;
    }

    public int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public AnonymousClass8NS reverse() {
        return this.forwardOrder;
    }

    public String toString() {
        String valueOf = String.valueOf(this.forwardOrder);
        return AnonymousClass000.A0X(".reverse()", AnonymousClass6C8.A0g(valueOf.length() + 10, valueOf));
    }

    public C129826aw(AnonymousClass8NS r1) {
        this.forwardOrder = r1;
    }
}

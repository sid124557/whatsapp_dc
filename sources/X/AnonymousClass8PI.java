package X;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: X.8PI  reason: invalid class name */
public abstract class AnonymousClass8PI implements C188518z1, Serializable {
    public static final Object NO_RECEIVER = AnonymousClass8LH.A00;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public transient C188518z1 reflected;
    public final String signature;

    public AnonymousClass8PI(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    public abstract C188518z1 computeReflected();

    public C188518z1 compute() {
        C188518z1 r0 = this.reflected;
        if (r0 != null) {
            return r0;
        }
        this.reflected = this;
        return this;
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C834448k getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return new AnonymousClass8PE(cls);
        }
        return new AnonymousClass8PJ(cls);
    }

    public String getSignature() {
        return this.signature;
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public List getAnnotations() {
        return getReflected().getAnnotations();
    }

    public List getParameters() {
        return getReflected().getParameters();
    }

    public C188518z1 getReflected() {
        C188518z1 compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C143076yI();
    }

    public C188478yx getReturnType() {
        return getReflected().getReturnType();
    }

    public List getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public AnonymousClass219 getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public AnonymousClass8PI() {
        this(NO_RECEIVER);
    }

    public AnonymousClass8PI(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}

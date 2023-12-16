package com.facebook.jni;

import X.AnonymousClass000;
import X.AnonymousClass8SI;
import X.C159587m8;

public class HybridData {
    public final Destructor mDestructor = new Destructor(this);

    public class Destructor extends AnonymousClass8SI {
        public volatile long mNativePointer;

        public static native void deleteNative(long j);

        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }

        public Destructor(Object obj) {
            super(obj);
        }
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }

    static {
        C159587m8.A01("fbjni");
    }

    public boolean isValid() {
        return AnonymousClass000.A1S((this.mDestructor.mNativePointer > 0 ? 1 : (this.mDestructor.mNativePointer == 0 ? 0 : -1)));
    }
}

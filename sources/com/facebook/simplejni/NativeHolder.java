package com.facebook.simplejni;

import X.AnonymousClass000;
import X.AnonymousClass8SJ;

public class NativeHolder {
    public final Destructor mDestructor;
    public final long mNativePointer;

    public class Destructor extends AnonymousClass8SJ {
        public long mNativeDestructorFunctionPointer;
        public long mNativePointer;

        public static native void deleteNative(long j, long j2);

        public void destruct() {
            long j = this.mNativePointer;
            if (j != 0) {
                deleteNative(j, this.mNativeDestructorFunctionPointer);
                this.mNativePointer = 0;
            }
        }

        public Destructor(Object obj, long j, long j2) {
            super(obj);
            this.mNativePointer = j;
            this.mNativeDestructorFunctionPointer = j2;
        }
    }

    public synchronized void release() {
        this.mDestructor.destruct();
    }

    public boolean isNativeEqual(NativeHolder nativeHolder) {
        return AnonymousClass000.A1T((nativeHolder.mNativePointer > this.mNativePointer ? 1 : (nativeHolder.mNativePointer == this.mNativePointer ? 0 : -1)));
    }

    public NativeHolder(long j, long j2) {
        this.mNativePointer = j;
        this.mDestructor = new Destructor(this, j, j2);
    }
}

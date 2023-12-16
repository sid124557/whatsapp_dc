package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C06790Zf;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public interface IAppHost extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.IAppHost";

    public class Default implements IAppHost {
        public IBinder asBinder() {
            return null;
        }

        public void invalidate() {
        }

        public void showToast(CharSequence charSequence, int i) {
        }

        public void dismissAlert(int i) {
        }

        public C06790Zf openMicrophone(C06790Zf r2) {
            return null;
        }

        public void sendLocation(Location location) {
        }

        public void setSurfaceCallback(ISurfaceCallback iSurfaceCallback) {
        }

        public void showAlert(C06790Zf r1) {
        }
    }

    public abstract class Stub extends Binder implements IAppHost {
        public static final int TRANSACTION_dismissAlert = 7;
        public static final int TRANSACTION_invalidate = 2;
        public static final int TRANSACTION_openMicrophone = 8;
        public static final int TRANSACTION_sendLocation = 5;
        public static final int TRANSACTION_setSurfaceCallback = 4;
        public static final int TRANSACTION_showAlert = 6;
        public static final int TRANSACTION_showToast = 3;

        public class Proxy implements IAppHost {
            public IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IAppHost.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void dismissAlert(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    obtain.writeInt(i);
                    AnonymousClass000.A0w(this.mRemote, obtain, obtain2, 7);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void invalidate() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    AnonymousClass000.A0w(this.mRemote, obtain, obtain2, 2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C06790Zf openMicrophone(C06790Zf r6) {
                Object obj;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    if (r6 != null) {
                        AnonymousClass001.A15(obtain, r6, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = C06790Zf.CREATOR;
                    if (obtain2.readInt() != 0) {
                        obj = creator.createFromParcel(obtain2);
                    } else {
                        obj = null;
                    }
                    return (C06790Zf) obj;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void sendLocation(Location location) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    if (location != null) {
                        AnonymousClass001.A15(obtain, location, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setSurfaceCallback(ISurfaceCallback iSurfaceCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    obtain.writeStrongInterface(iSurfaceCallback);
                    AnonymousClass000.A0w(this.mRemote, obtain, obtain2, 4);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void showAlert(C06790Zf r6) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    if (r6 != null) {
                        AnonymousClass001.A15(obtain, r6, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void showToast(CharSequence charSequence, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IAppHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAppHost.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IAppHost)) {
                return new Proxy(iBinder);
            }
            return (IAppHost) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
            r6.writeNoException();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
                r3 = this;
                java.lang.String r2 = "androidx.car.app.IAppHost"
                r1 = 1
                if (r4 < r1) goto L_0x0010
                r0 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 > r0) goto L_0x0015
                r5.enforceInterface(r2)
                switch(r4) {
                    case 2: goto L_0x0074;
                    case 3: goto L_0x0064;
                    case 4: goto L_0x0058;
                    case 5: goto L_0x004c;
                    case 6: goto L_0x0040;
                    case 7: goto L_0x0038;
                    case 8: goto L_0x001e;
                    default: goto L_0x0010;
                }
            L_0x0010:
                boolean r0 = super.onTransact(r4, r5, r6, r7)
                return r0
            L_0x0015:
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 != r0) goto L_0x0010
                r6.writeString(r2)
                return r1
            L_0x001e:
                android.os.Parcelable$Creator r0 = X.C06790Zf.CREATOR
                java.lang.Object r0 = X.AnonymousClass000.A0J(r5, r0)
                X.0Zf r0 = (X.C06790Zf) r0
                X.0Zf r0 = r3.openMicrophone(r0)
                r6.writeNoException()
                if (r0 == 0) goto L_0x0033
                X.AnonymousClass001.A15(r6, r0, r1)
                return r1
            L_0x0033:
                r0 = 0
                r6.writeInt(r0)
                return r1
            L_0x0038:
                int r0 = r5.readInt()
                r3.dismissAlert(r0)
                goto L_0x0077
            L_0x0040:
                android.os.Parcelable$Creator r0 = X.C06790Zf.CREATOR
                java.lang.Object r0 = X.AnonymousClass000.A0J(r5, r0)
                X.0Zf r0 = (X.C06790Zf) r0
                r3.showAlert(r0)
                goto L_0x0077
            L_0x004c:
                android.os.Parcelable$Creator r0 = android.location.Location.CREATOR
                java.lang.Object r0 = X.AnonymousClass000.A0J(r5, r0)
                android.location.Location r0 = (android.location.Location) r0
                r3.sendLocation(r0)
                goto L_0x0077
            L_0x0058:
                android.os.IBinder r0 = r5.readStrongBinder()
                androidx.car.app.ISurfaceCallback r0 = androidx.car.app.ISurfaceCallback.Stub.asInterface(r0)
                r3.setSurfaceCallback(r0)
                goto L_0x0077
            L_0x0064:
                android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r2 = X.AnonymousClass000.A0J(r5, r0)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                int r0 = r5.readInt()
                r3.showToast(r2, r0)
                goto L_0x0077
            L_0x0074:
                r3.invalidate()
            L_0x0077:
                r6.writeNoException()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.car.app.IAppHost.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public Stub() {
            attachInterface(this, IAppHost.DESCRIPTOR);
        }
    }

    void dismissAlert(int i);

    void invalidate();

    C06790Zf openMicrophone(C06790Zf r1);

    void sendLocation(Location location);

    void setSurfaceCallback(ISurfaceCallback iSurfaceCallback);

    void showAlert(C06790Zf r1);

    void showToast(CharSequence charSequence, int i);
}

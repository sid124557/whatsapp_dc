package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C06790Zf;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.ICarHost;

public interface ICarApp extends IInterface {
    public static final String DESCRIPTOR = "androidx.car.app.ICarApp";

    public class Default implements ICarApp {
        public IBinder asBinder() {
            return null;
        }

        public void getManager(String str, IOnDoneCallback iOnDoneCallback) {
        }

        public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        }

        public void onHandshakeCompleted(C06790Zf r1, IOnDoneCallback iOnDoneCallback) {
        }

        public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
        }

        public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        }

        public void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        }
    }

    public abstract class Stub extends Binder implements ICarApp {
        public static final int TRANSACTION_getAppInfo = 10;
        public static final int TRANSACTION_getManager = 9;
        public static final int TRANSACTION_onAppCreate = 2;
        public static final int TRANSACTION_onAppPause = 5;
        public static final int TRANSACTION_onAppResume = 4;
        public static final int TRANSACTION_onAppStart = 3;
        public static final int TRANSACTION_onAppStop = 6;
        public static final int TRANSACTION_onConfigurationChanged = 8;
        public static final int TRANSACTION_onHandshakeCompleted = 11;
        public static final int TRANSACTION_onNewIntent = 7;

        public class Proxy implements ICarApp {
            public IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICarApp.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(10, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void getManager(String str, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    AnonymousClass001.A14(iOnDoneCallback, obtain, ICarApp.DESCRIPTOR, str);
                    this.mRemote.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iCarHost);
                    if (intent != null) {
                        AnonymousClass001.A15(obtain, intent, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (configuration != null) {
                        AnonymousClass001.A15(obtain, configuration, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iOnDoneCallback);
                    AnonymousClass000.A0u(this.mRemote, obtain);
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppPause(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppResume(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppStart(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    AnonymousClass000.A0v(this.mRemote, obtain);
                } finally {
                    obtain.recycle();
                }
            }

            public void onAppStop(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    if (configuration != null) {
                        AnonymousClass001.A15(obtain, configuration, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onHandshakeCompleted(C06790Zf r6, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    if (r6 != null) {
                        AnonymousClass001.A15(obtain, r6, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(11, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    if (intent != null) {
                        AnonymousClass001.A15(obtain, intent, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static ICarApp asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICarApp.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICarApp)) {
                return new Proxy(iBinder);
            }
            return (ICarApp) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(ICarApp.DESCRIPTOR);
                    switch (i) {
                        case 2:
                            onAppCreate(ICarHost.Stub.asInterface(parcel.readStrongBinder()), (Intent) AnonymousClass000.A0J(parcel, Intent.CREATOR), (Configuration) AnonymousClass000.A0J(parcel, Configuration.CREATOR), AnonymousClass000.A0D(parcel));
                            return true;
                        case 3:
                            onAppStart(AnonymousClass000.A0D(parcel));
                            return true;
                        case 4:
                            onAppResume(AnonymousClass000.A0D(parcel));
                            return true;
                        case 5:
                            onAppPause(AnonymousClass000.A0D(parcel));
                            return true;
                        case 6:
                            onAppStop(AnonymousClass000.A0D(parcel));
                            return true;
                        case 7:
                            onNewIntent((Intent) AnonymousClass000.A0J(parcel, Intent.CREATOR), AnonymousClass000.A0D(parcel));
                            return true;
                        case 8:
                            onConfigurationChanged((Configuration) AnonymousClass000.A0J(parcel, Configuration.CREATOR), AnonymousClass000.A0D(parcel));
                            return true;
                        case 9:
                            getManager(parcel.readString(), AnonymousClass000.A0D(parcel));
                            return true;
                        case 10:
                            getAppInfo(AnonymousClass000.A0D(parcel));
                            return true;
                        case 11:
                            onHandshakeCompleted((C06790Zf) AnonymousClass000.A0J(parcel, C06790Zf.CREATOR), AnonymousClass000.A0D(parcel));
                            return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(ICarApp.DESCRIPTOR);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public Stub() {
            attachInterface(this, ICarApp.DESCRIPTOR);
        }
    }

    void getAppInfo(IOnDoneCallback iOnDoneCallback);

    void getManager(String str, IOnDoneCallback iOnDoneCallback);

    void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback);

    void onAppPause(IOnDoneCallback iOnDoneCallback);

    void onAppResume(IOnDoneCallback iOnDoneCallback);

    void onAppStart(IOnDoneCallback iOnDoneCallback);

    void onAppStop(IOnDoneCallback iOnDoneCallback);

    void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback);

    void onHandshakeCompleted(C06790Zf r1, IOnDoneCallback iOnDoneCallback);

    void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback);
}

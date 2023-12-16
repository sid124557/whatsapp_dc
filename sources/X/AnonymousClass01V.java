package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.MultiInstanceInvalidationService;
import java.util.Map;

/* renamed from: X.01V  reason: invalid class name */
public final class AnonymousClass01V extends Binder implements IInterface {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    public int A00(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
        C162457s7.A0J(iMultiInstanceInvalidationCallback, 0);
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
        RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
        synchronized (remoteCallbackList) {
            int i2 = multiInstanceInvalidationService.A00 + 1;
            multiInstanceInvalidationService.A00 = i2;
            Integer valueOf = Integer.valueOf(i2);
            if (remoteCallbackList.register(iMultiInstanceInvalidationCallback, valueOf)) {
                multiInstanceInvalidationService.A03.put(valueOf, str);
                i = i2;
            } else {
                multiInstanceInvalidationService.A00--;
            }
        }
        return i;
    }

    public void A01(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i) {
        C162457s7.A0J(iMultiInstanceInvalidationCallback, 0);
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
        RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
        synchronized (remoteCallbackList) {
            remoteCallbackList.unregister(iMultiInstanceInvalidationCallback);
            multiInstanceInvalidationService.A03.remove(Integer.valueOf(i));
        }
    }

    public void A02(String[] strArr, int i) {
        Parcel obtain;
        C162457s7.A0J(strArr, 1);
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
        RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
        synchronized (remoteCallbackList) {
            Map map = multiInstanceInvalidationService.A03;
            String str = (String) AnonymousClass001.A0i(map, i);
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                int i2 = 0;
                while (i2 < beginBroadcast) {
                    try {
                        Object broadcastCookie = remoteCallbackList.getBroadcastCookie(i2);
                        C162457s7.A0K(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) broadcastCookie).intValue();
                        String str2 = (String) AnonymousClass001.A0i(map, intValue);
                        if (i != intValue && str.equals(str2)) {
                            try {
                                C08590ej r1 = (C08590ej) ((IMultiInstanceInvalidationCallback) remoteCallbackList.getBroadcastItem(i2));
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                                obtain.writeStringArray(strArr);
                                r1.A00.transact(1, obtain, (Parcel) null, 1);
                                obtain.recycle();
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            } catch (Throwable th) {
                                obtain.recycle();
                                throw th;
                            }
                        }
                        i2++;
                    } catch (Throwable th2) {
                        remoteCallbackList.finishBroadcast();
                        throw th2;
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass01V(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this();
        this.A00 = multiInstanceInvalidationService;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IMultiInstanceInvalidationCallback r1;
        IMultiInstanceInvalidationCallback r12;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                if (i == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        r1 = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
                            r1 = new C08590ej(readStrongBinder);
                        } else {
                            r1 = (IMultiInstanceInvalidationCallback) queryLocalInterface;
                        }
                    }
                    int A002 = A00(r1, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(A002);
                    return true;
                } else if (i == 2) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        r12 = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof IMultiInstanceInvalidationCallback)) {
                            r12 = new C08590ej(readStrongBinder2);
                        } else {
                            r12 = (IMultiInstanceInvalidationCallback) queryLocalInterface2;
                        }
                    }
                    A01(r12, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                } else if (i == 3) {
                    A02(parcel.createStringArray(), parcel.readInt());
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public AnonymousClass01V() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}

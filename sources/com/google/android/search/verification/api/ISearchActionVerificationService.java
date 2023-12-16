package com.google.android.search.verification.api;

import X.AnonymousClass01U;
import X.AnonymousClass0ZH;
import X.AnonymousClass6C7;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ISearchActionVerificationService extends IInterface {

    public abstract class Stub extends AnonymousClass01U implements ISearchActionVerificationService {
        public static final String DESCRIPTOR = "com.google.android.search.verification.api.ISearchActionVerificationService";
        public static final int TRANSACTION_getVersion = 2;
        public static final int TRANSACTION_isSearchAction = 1;

        public class Proxy extends AnonymousClass0ZH implements ISearchActionVerificationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            public int getVersion() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            public boolean isSearchAction(Intent intent, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                if (intent == null) {
                    obtainAndWriteInterfaceToken.writeInt(0);
                } else {
                    obtainAndWriteInterfaceToken.writeInt(1);
                    intent.writeToParcel(obtainAndWriteInterfaceToken, 0);
                }
                if (bundle == null) {
                    obtainAndWriteInterfaceToken.writeInt(0);
                } else {
                    obtainAndWriteInterfaceToken.writeInt(1);
                    bundle.writeToParcel(obtainAndWriteInterfaceToken, 0);
                }
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean A1W = AnonymousClass6C7.A1W(transactAndReadException);
                transactAndReadException.recycle();
                return A1W;
            }
        }

        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            if (i == 1) {
                i3 = isSearchAction((Intent) AnonymousClass6C7.A0Q(parcel, Intent.CREATOR), (Bundle) AnonymousClass6C7.A0Q(parcel, Bundle.CREATOR));
            } else if (i != 2) {
                return false;
            } else {
                i3 = getVersion();
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISearchActionVerificationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface instanceof ISearchActionVerificationService) {
                return (ISearchActionVerificationService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }
    }

    int getVersion();

    boolean isSearchAction(Intent intent, Bundle bundle);
}

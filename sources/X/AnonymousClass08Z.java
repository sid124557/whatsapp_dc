package X;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.08Z  reason: invalid class name */
public final class AnonymousClass08Z extends C04100Mu implements C17190ui {
    public Application A00;
    public Bundle A01;
    public AnonymousClass0O9 A02;
    public AnonymousClass0UG A03;
    public final C17190ui A04;

    public final C05550Ty A02(Class cls, String str) {
        List list;
        Object[] objArr;
        Application application;
        AnonymousClass0O9 r7 = this.A02;
        if (r7 != null) {
            boolean isAssignableFrom = AnonymousClass08N.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.A00 == null) {
                list = AnonymousClass0VV.A01;
            } else {
                list = AnonymousClass0VV.A00;
            }
            Constructor A012 = AnonymousClass0VV.A01(cls, list);
            if (A012 != null) {
                AnonymousClass0UG r3 = this.A03;
                SavedStateHandleController savedStateHandleController = new SavedStateHandleController(AnonymousClass0IU.A00(r3.A01(str), this.A01), str);
                savedStateHandleController.A00(r7, r3);
                C05090Rx.A01(r7, r3);
                if (!isAssignableFrom || (application = this.A00) == null) {
                    objArr = new Object[]{savedStateHandleController.A01};
                } else {
                    objArr = AnonymousClass002.A0M();
                    C162457s7.A0H(application);
                    objArr[0] = application;
                    objArr[1] = savedStateHandleController.A01;
                }
                C05550Ty A002 = AnonymousClass0VV.A00(cls, A012, objArr);
                A002.A0B(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
                return A002;
            } else if (this.A00 != null) {
                return this.A04.Azr(cls);
            } else {
                return AnonymousClass0IX.A00().Azr(cls);
            }
        } else {
            throw AnonymousClass002.A0G("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public C05550Ty Azr(Class cls) {
        C162457s7.A0J(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return A02(cls, canonicalName);
        }
        throw AnonymousClass001.A0c("Local and anonymous classes can not be ViewModels");
    }

    public C05550Ty B09(AnonymousClass0N3 r7, Class cls) {
        List list;
        C162457s7.A0J(cls, 0);
        C162457s7.A0J(r7, 1);
        String str = (String) r7.A00(C08380eM.A01);
        if (str == null) {
            throw AnonymousClass001.A0e("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (r7.A00(C06120Wi.A01) != null && r7.A00(C06120Wi.A02) != null) {
            Object A002 = r7.A00(AnonymousClass08X.A02);
            boolean isAssignableFrom = AnonymousClass08N.class.isAssignableFrom(cls);
            if (!isAssignableFrom || A002 == null) {
                list = AnonymousClass0VV.A01;
            } else {
                list = AnonymousClass0VV.A00;
            }
            Constructor A012 = AnonymousClass0VV.A01(cls, list);
            if (A012 == null) {
                return this.A04.B09(r7, cls);
            }
            if (!isAssignableFrom || A002 == null) {
                return AnonymousClass0VV.A00(cls, A012, C06120Wi.A00(r7));
            }
            Object[] A0M = AnonymousClass002.A0M();
            A0M[0] = A002;
            A0M[1] = C06120Wi.A00(r7);
            return AnonymousClass0VV.A00(cls, A012, A0M);
        } else if (this.A02 != null) {
            return A02(cls, str);
        } else {
            throw AnonymousClass001.A0e("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public static final AnonymousClass08X A00(Application application) {
        AnonymousClass08X r0 = AnonymousClass08X.A01;
        if (r0 == null) {
            r0 = new AnonymousClass08X(application);
            AnonymousClass08X.A01 = r0;
        }
        C162457s7.A0H(r0);
        return r0;
    }

    public void A01(C05550Ty r3) {
        AnonymousClass0O9 r1 = this.A02;
        if (r1 != null) {
            C05090Rx.A00(r1, r3, this.A03);
        }
    }

    public AnonymousClass08Z(Application application, Bundle bundle, C17310vJ r4) {
        AnonymousClass08X r0;
        this.A03 = r4.BCR();
        this.A02 = r4.getLifecycle();
        this.A01 = bundle;
        this.A00 = application;
        if (application != null) {
            r0 = A00(application);
        } else {
            r0 = new AnonymousClass08X();
        }
        this.A04 = r0;
    }

    public AnonymousClass08Z() {
        this.A04 = new AnonymousClass08X();
    }
}

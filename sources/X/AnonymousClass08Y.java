package X;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;

/* renamed from: X.08Y  reason: invalid class name */
public abstract class AnonymousClass08Y extends C04100Mu implements C17190ui {
    public Bundle A00;
    public AnonymousClass0O9 A01;
    public AnonymousClass0UG A02;

    public abstract C05550Ty A02(AnonymousClass0XV r1, Class cls, String str);

    public void A01(C05550Ty r3) {
        AnonymousClass0UG r1 = this.A02;
        if (r1 != null) {
            C05090Rx.A00(this.A01, r3, r1);
        }
    }

    public final C05550Ty A03(Class cls, String str) {
        AnonymousClass0UG r4 = this.A02;
        AnonymousClass0O9 r3 = this.A01;
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(AnonymousClass0IU.A00(r4.A01(str), this.A00), str);
        savedStateHandleController.A00(r3, r4);
        C05090Rx.A01(r3, r4);
        C05550Ty A022 = A02(savedStateHandleController.A01, cls, str);
        A022.A0B(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
        return A022;
    }

    public final C05550Ty B09(AnonymousClass0N3 r3, Class cls) {
        String str = (String) r3.A00(C08380eM.A01);
        if (str == null) {
            throw AnonymousClass001.A0e("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (this.A02 != null) {
            return A03(cls, str);
        } else {
            return A02(C06120Wi.A00(r3), cls, str);
        }
    }

    public AnonymousClass08Y(Bundle bundle, C17310vJ r3) {
        this.A02 = r3.BCR();
        this.A01 = r3.getLifecycle();
        this.A00 = bundle;
    }

    public final C05550Ty Azr(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw AnonymousClass001.A0c("Local and anonymous classes can not be ViewModels");
        } else if (this.A01 != null) {
            return A03(cls, canonicalName);
        } else {
            throw AnonymousClass002.A0G("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public AnonymousClass08Y() {
    }
}

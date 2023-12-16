package X;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleAttacher;
import java.util.Map;

/* renamed from: X.0Wi  reason: invalid class name and case insensitive filesystem */
public final class C06120Wi {
    public static final C15120qo A00 = new C18160wq(0);
    public static final C15120qo A01 = new C18160wq(1);
    public static final C15120qo A02 = new C18160wq(2);

    public static final AnonymousClass08O A01(C15940sD r4) {
        C162457s7.A0J(r4, 0);
        AnonymousClass0OA r3 = new AnonymousClass0OA();
        Class<AnonymousClass08O> cls = AnonymousClass08O.class;
        r3.A01(AnonymousClass0pP.A00, C57982uW.A00(cls));
        return (AnonymousClass08O) new AnonymousClass0XL(r3.A00(), r4).A02(cls, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final AnonymousClass0XV A00(AnonymousClass0N3 r5) {
        C08620em r2;
        C17310vJ r22 = (C17310vJ) r5.A00(A01);
        if (r22 != null) {
            C15940sD r1 = (C15940sD) r5.A00(A02);
            if (r1 != null) {
                Bundle bundle = (Bundle) r5.A00(A00);
                String str = (String) r5.A00(C08380eM.A01);
                if (str != null) {
                    C16050sO A022 = r22.BCR().A02();
                    if (!(A022 instanceof C08620em) || (r2 = (C08620em) A022) == null) {
                        throw AnonymousClass001.A0e("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    }
                    Map map = A01(r1).A00;
                    AnonymousClass0XV r0 = (AnonymousClass0XV) map.get(str);
                    if (r0 != null) {
                        return r0;
                    }
                    AnonymousClass0XV A002 = AnonymousClass0IU.A00(r2.A00(str), bundle);
                    map.put(str, A002);
                    return A002;
                }
                throw AnonymousClass001.A0c("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw AnonymousClass001.A0c("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw AnonymousClass001.A0c("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void A02(C17310vJ r4) {
        AnonymousClass0GC r1 = ((AnonymousClass08A) r4.getLifecycle()).A02;
        C162457s7.A0D(r1);
        if (r1 != AnonymousClass0GC.INITIALIZED && r1 != AnonymousClass0GC.CREATED) {
            throw AnonymousClass001.A0c("Failed requirement.");
        } else if (r4.BCR().A02() == null) {
            C08620em r2 = new C08620em((C15940sD) r4, r4.BCR());
            r4.BCR().A04(r2, "androidx.lifecycle.internal.SavedStateHandlesProvider");
            r4.getLifecycle().A00(new SavedStateHandleAttacher(r2));
        }
    }
}

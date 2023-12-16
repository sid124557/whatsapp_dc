package X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.util.Pair;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import com.whatsapp.group.GroupProfileEmojiEditor;
import com.whatsapp.mediacomposer.VideoTimelineView;
import com.whatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview;
import com.whatsapp.util.Log;
import com.whatsapp.util.WaAsyncTask$$ExternalSyntheticLambda0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5ZM  reason: invalid class name */
public abstract class AnonymousClass5ZM {
    public C17280vG A00;
    public C15910sA A01;
    public final AnonymousClass4MC A02;

    public AnonymousClass5ZM(C15910sA r2) {
        this(r2, true);
    }

    public static C186308v5 A04(AnonymousClass5O9 r2, String str, int i, boolean z) {
        C108945dp r0 = new C108945dp();
        r0.A01 = 2;
        r0.A00 = i;
        r0.A02 = 2;
        r0.A03 = str;
        r0.A04 = z;
        return r2.A00(r0);
    }

    public abstract Object A08(Object... objArr);

    public static Pair A03(Object obj, Collection collection) {
        return new Pair(obj, new ArrayList(collection));
    }

    public static void A05(CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel, AnonymousClass5ZM r3) {
        r3.A02.executeOnExecutor(callsHistoryFragmentV2ViewModel.A0B, new Void[0]);
    }

    public final int A06() {
        AsyncTask.Status status = this.A02.getStatus();
        if (status == AsyncTask.Status.PENDING) {
            return 0;
        }
        if (status == AsyncTask.Status.RUNNING) {
            return 1;
        }
        return 2;
    }

    public C15910sA A07(Class cls) {
        if (C15910sA.class.equals(cls)) {
            return this.A01;
        }
        return (C15910sA) cls.cast(this.A01);
    }

    public void A09() {
        ContactPickerFragment contactPickerFragment;
        if (this instanceof C994155q) {
            ((C994155q) this).A06.A0A.markerEnd(453128091, 2, 4);
        } else if (this instanceof AnonymousClass55M) {
            ((AnonymousClass55M) this).A00.clear();
        } else if (this instanceof C993155g) {
            C182968pH r1 = (C182968pH) ((C993155g) this).A0B.get();
            if (r1 == null) {
                Log.i("SecurityCodeTask/onPostExecute/null callback");
            } else {
                r1.Blx(true);
            }
        } else if (this instanceof C993255h) {
            C185128t8 r0 = (C185128t8) ((C993255h) this).A0E.get();
            if (r0 != null) {
                r0.BFd();
            }
        } else if (this instanceof C992955e) {
            C185688u5 r02 = (C185688u5) ((C992955e) this).A05.get();
            if (r02 != null) {
                r02.BT9();
            }
        } else if ((this instanceof C993055f) && (contactPickerFragment = (ContactPickerFragment) ((C993055f) this).A07.get()) != null && contactPickerFragment.A16()) {
            Log.i("contactpicker/existencecheck/canceled");
            contactPickerFragment.A1C = null;
            contactPickerFragment.A19.BjL();
        }
    }

    public void A0A() {
        WeakReference weakReference;
        int i;
        VerifyPhoneNumber verifyPhoneNumber;
        if (this instanceof C992655b) {
            C89654ea A0F = C18320x8.A0F(((C992655b) this).A09);
            if (A0F != null) {
                C89654ea.A4W(A0F);
            }
        } else if (this instanceof AnonymousClass55W) {
            C89654ea A0F2 = C18320x8.A0F(((AnonymousClass55W) this).A07);
            if (A0F2 != null) {
                C89654ea.A4W(A0F2);
            }
        } else {
            if (this instanceof AnonymousClass55V) {
                weakReference = ((AnonymousClass55V) this).A05;
            } else if (this instanceof AnonymousClass55U) {
                AnonymousClass55U r0 = (AnonymousClass55U) this;
                Resources resources = r0.A03;
                if (resources != null) {
                    WallpaperImagePreview wallpaperImagePreview = r0.A05;
                    wallpaperImagePreview.setImageDrawable(resources.getDrawable(r0.A00));
                    wallpaperImagePreview.setVisibility(0);
                    return;
                }
                return;
            } else {
                if (this instanceof C992555a) {
                    C992555a r2 = (C992555a) this;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("VerifyCodeTaskonPreExecute/method=");
                    C18260x0.A1L(A0o, r2.A08);
                    C184588sB r1 = (C184588sB) r2.A0A.get();
                    if (r1 != null) {
                        VerifyPhoneNumber verifyPhoneNumber2 = (VerifyPhoneNumber) r1;
                        if (!verifyPhoneNumber2.A8D()) {
                            i = 23;
                            verifyPhoneNumber = verifyPhoneNumber2;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (this instanceof AnonymousClass55R) {
                    AnonymousClass644 r12 = (AnonymousClass644) ((AnonymousClass55R) this).A04.get();
                    if (r12 != null) {
                        i = 2;
                        verifyPhoneNumber = (Activity) r12;
                    } else {
                        return;
                    }
                } else if (this instanceof C993155g) {
                    C182968pH r13 = (C182968pH) ((C993155g) this).A0B.get();
                    if (r13 == null) {
                        Log.i("SecurityCodeTask/onPreExecute/null callback");
                        return;
                    }
                    r13.Blx(false);
                    VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) r13;
                    i = verifyTwoFactorAuth.A00;
                    verifyPhoneNumber = verifyTwoFactorAuth;
                } else if (this instanceof C994055p) {
                    C994055p r4 = (C994055p) this;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("RequestCodeTaskonPreExecute/method=");
                    String str = r4.A0C;
                    C18260x0.A1L(A0o2, str);
                    C185138t9 r22 = (C185138t9) r4.A0F.get();
                    C18270x1.A0j(C18270x1.A03(r4.A05), "registration_code_request_method", str);
                    if (r22 != null) {
                        r22.BpC(r4.A0G, str);
                        return;
                    }
                    return;
                } else if (this instanceof C993255h) {
                    C993255h r14 = (C993255h) this;
                    C185128t8 r42 = (C185128t8) r14.A0E.get();
                    AnonymousClass33p r3 = r14.A04;
                    C18270x1.A0j(C18270x1.A03(r3), "pref_autoconf_feo2_query_status", "did_not_query");
                    C18270x1.A0h(C18270x1.A03(r3), "autoconf_type", -1);
                    if (r42 != null) {
                        r42.Bp8();
                        return;
                    }
                    return;
                } else if (this instanceof C993755m) {
                    ((C993755m) this).A01.A0G(0, R.string.f11nameremoved);
                    return;
                } else if (this instanceof AnonymousClass55S) {
                    C15910sA A07 = A07(GroupProfileEmojiEditor.class);
                    AnonymousClass6A8 r02 = new AnonymousClass6A8(this, 6);
                    if (A07 != null) {
                        r02.AwB(A07);
                        return;
                    }
                    return;
                } else if (this instanceof C993855n) {
                    C993855n r32 = (C993855n) this;
                    C08270df r23 = (C08270df) r32.A05.get();
                    if (r23 != null) {
                        ProgressDialogFragment A002 = ProgressDialogFragment.A00(R.string.f11nameremoved, R.string.f11nameremoved);
                        r32.A01 = A002;
                        A002.A1O(r23, "count_progress");
                        return;
                    }
                    return;
                } else if (this instanceof AnonymousClass55Q) {
                    ((AnonymousClass55Q) this).A00.A0G(0, R.string.f11nameremoved);
                    return;
                } else if (this instanceof C992955e) {
                    C185688u5 r03 = (C185688u5) ((C992955e) this).A05.get();
                    if (r03 != null) {
                        r03.BTB();
                        return;
                    }
                    return;
                } else if (this instanceof C993055f) {
                    ContactPickerFragment contactPickerFragment = (ContactPickerFragment) ((C993055f) this).A07.get();
                    if (contactPickerFragment != null && contactPickerFragment.A16()) {
                        Log.i("contactpicker/existencecheck/started");
                        contactPickerFragment.A19.BpA(0, R.string.f11nameremoved);
                        return;
                    }
                    return;
                } else if (this instanceof C992855d) {
                    weakReference = ((C992855d) this).A0G;
                } else {
                    return;
                }
                C621433s.A01(verifyPhoneNumber, i);
                return;
            }
            AnonymousClass4FU r24 = (AnonymousClass4FU) weakReference.get();
            if (r24 != null) {
                r24.BpA(0, R.string.f11nameremoved);
            }
        }
    }

    public void A0B(Object obj) {
        AnonymousClass3Z6 r5;
        File file;
        if (this instanceof C994155q) {
            ((C994155q) this).A06.A0A.markerEnd(453128091, 2, 4);
        } else if (this instanceof AnonymousClass55Z) {
            AnonymousClass55Z r1 = (AnonymousClass55Z) this;
            r1.A00 = null;
            r1.A01 = null;
        } else if (this instanceof C993455j) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("gif/cache/loading onCanceled ");
            C18260x0.A1J(A0o, ((C993455j) this).A08);
        } else if ((this instanceof AnonymousClass55N) && (r5 = (AnonymousClass3Z6) obj) != null && (file = (File) r5.first) != null) {
            Log.i("onCancelled/cancelled with non-null file, deleting file");
            C627536m.A0O(file);
        }
    }

    public final void A0D(boolean z) {
        this.A02.cancel(z);
    }

    public void A0E(Object... objArr) {
        C87824Wg r1;
        View view;
        if (this instanceof AnonymousClass55T) {
            AnonymousClass55T r7 = (AnonymousClass55T) this;
            VideoTimelineView videoTimelineView = (VideoTimelineView) r7.A05.get();
            if (videoTimelineView != null) {
                ArrayList arrayList = videoTimelineView.A0P;
                if (arrayList != null) {
                    Collections.addAll(arrayList, objArr);
                }
                if (System.currentTimeMillis() > r7.A00 + 500) {
                    r7.A00 = System.currentTimeMillis();
                    videoTimelineView.invalidate();
                }
            }
        } else if (this instanceof AnonymousClass55Y) {
            List[] listArr = (List[]) objArr;
            C162457s7.A0J(listArr, 0);
            GalleryPickerFragment galleryPickerFragment = (GalleryPickerFragment) ((AnonymousClass55Y) this).A09.get();
            if (galleryPickerFragment != null) {
                for (List list : listArr) {
                    if (!(galleryPickerFragment.A0Q() == null || (r1 = galleryPickerFragment.A0I) == null)) {
                        C162457s7.A0J(list, 0);
                        r1.A00.addAll(list);
                        r1.A05();
                        AnonymousClass5ZR r0 = galleryPickerFragment.A0D;
                        if (r0 == null) {
                            throw C18270x1.A0S("waPermissionsHelper");
                        } else if (r0.A04() == C997357z.DENIED) {
                            galleryPickerFragment.A1J();
                        } else {
                            C18270x1.A0p(galleryPickerFragment.A06);
                            C87824Wg r02 = galleryPickerFragment.A0I;
                            if (r02 == null || r02.A00.size() != 0) {
                                view = galleryPickerFragment.A08;
                            } else {
                                WaTextView waTextView = galleryPickerFragment.A08;
                                if (waTextView != null) {
                                    waTextView.setVisibility(0);
                                }
                                view = galleryPickerFragment.A06;
                            }
                            C18270x1.A0p(view);
                        }
                    }
                }
            }
        } else if (this instanceof AnonymousClass55X) {
            AnonymousClass55X r5 = (AnonymousClass55X) this;
            List[] listArr2 = (List[]) objArr;
            GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) r5.A08.get();
            if (galleryFragmentBase != null) {
                for (List list2 : listArr2) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(galleryFragmentBase.A0J);
                    A0o.append("/report bucket ");
                    A0o.append(r5.A00);
                    A0o.append(" ");
                    C18260x0.A1G(A0o, list2.size());
                    if (r5.A00 == 0) {
                        galleryFragmentBase.A0K.clear();
                        galleryFragmentBase.A0A.A05();
                    }
                    r5.A00 += list2.size();
                    galleryFragmentBase.A0K.addAll(list2);
                    galleryFragmentBase.A0A.A05();
                }
            }
        } else if (this instanceof AnonymousClass54P) {
            AnonymousClass5L3[] r9 = (AnonymousClass5L3[]) objArr;
            ContactPickerFragment contactPickerFragment = (ContactPickerFragment) ((AnonymousClass54P) this).A00.get();
            if (contactPickerFragment != null && contactPickerFragment.A16()) {
                contactPickerFragment.A1r(r9[0]);
            }
        } else if (this instanceof C994255r) {
            AnonymousClass7HS[] r92 = (AnonymousClass7HS[]) objArr;
            ContactPickerFragment contactPickerFragment2 = (ContactPickerFragment) ((C994255r) this).A06.get();
            if (contactPickerFragment2 != null && contactPickerFragment2.A16()) {
                contactPickerFragment2.A1q(r92[0]);
            }
        } else if (this instanceof AnonymousClass55L) {
            AnonymousClass55L r2 = (AnonymousClass55L) this;
            List[] listArr3 = (List[]) objArr;
            if (listArr3 == null || listArr3.length < 1) {
                Log.i("CallsHistoryDataSource/RefreshCallsHistoryItemsTask/onProgressUpdate values empty");
            } else {
                AnonymousClass5XL.A00(r2.A00, listArr3[0]);
            }
        }
    }

    public final void A0F(Object... objArr) {
        this.A02.A01(objArr);
    }

    public void A0C(Object obj) {
    }

    public AnonymousClass5ZM(C15910sA r3, boolean z) {
        this();
        C626936e.A01();
        C626936e.A0C(C18300x5.A1W(((AnonymousClass08A) r3.getLifecycle()).A02, AnonymousClass0GC.DESTROYED));
        this.A01 = r3;
        this.A00 = new WaAsyncTask$$ExternalSyntheticLambda0(this, z);
        r3.getLifecycle().A00(this.A00);
    }

    public AnonymousClass5ZM() {
        this.A02 = new AnonymousClass4MC(this);
    }
}

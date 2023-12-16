package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediacomposer.GifComposerFragment;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.Iterator;

/* renamed from: X.4bS  reason: invalid class name and case insensitive filesystem */
public abstract class C89084bS extends AnonymousClass6JG {
    public C08240dc A00 = null;
    public C08310eF A01 = null;
    public final C10550i7 A02 = new C10550i7();
    public final C10550i7 A03 = new C10550i7();
    public final C08270df A04;

    public /* bridge */ /* synthetic */ Object A0H(ViewGroup viewGroup, int i) {
        long A0B;
        GifComposerFragment gifComposerFragment;
        StatusPlaybackContactFragment statusPlaybackContactFragment;
        StatusPlaybackContactFragment statusPlaybackContactFragment2;
        boolean z = this instanceof C91644kc;
        if (z) {
            C104025Pi r0 = ((C91644kc) this).A00.A0D;
            Object obj = r0.A00.get(((AnonymousClass5Go) r0.A01.get(i)).A00.A0A.getRawString());
            C626936e.A06(obj);
            A0B = C18310x6.A0B(obj);
        } else {
            C91654kd r3 = (C91654kd) this;
            MediaComposerActivity mediaComposerActivity = r3.A00;
            Object obj2 = mediaComposerActivity.A1r.get(AnonymousClass4SG.A31(mediaComposerActivity).get(r3.A0M(i)));
            C626936e.A06(obj2);
            A0B = C18310x6.A0B(obj2);
        }
        C10550i7 r5 = this.A02;
        Object A05 = r5.A05(A0B, (Object) null);
        StatusPlaybackContactFragment statusPlaybackContactFragment3 = A05;
        if (A05 == null) {
            if (this.A00 == null) {
                this.A00 = new C08240dc(this.A04);
            }
            if (z) {
                StatusPlaybackActivity statusPlaybackActivity = ((C91644kc) this).A00;
                AnonymousClass5Go r02 = (AnonymousClass5Go) statusPlaybackActivity.A0D.A01.get(i);
                if (r02 != null) {
                    AnonymousClass2z0 r7 = statusPlaybackActivity.A0A;
                    UserJid userJid = r02.A00.A0A;
                    if (r7 == null) {
                        statusPlaybackContactFragment2 = StatusPlaybackContactFragment.A00(userJid, statusPlaybackActivity.A0O);
                    } else {
                        StatusPlaybackContactFragment statusPlaybackContactFragment4 = new StatusPlaybackContactFragment();
                        Bundle A08 = AnonymousClass002.A08();
                        AnonymousClass0x2.A0v(A08, userJid, "jid");
                        C107395bF.A07(A08, r7);
                        statusPlaybackContactFragment4.A0u(A08);
                        statusPlaybackContactFragment2 = statusPlaybackContactFragment4;
                    }
                    statusPlaybackContactFragment2.A1M(statusPlaybackActivity.A0P);
                    statusPlaybackContactFragment = statusPlaybackContactFragment2;
                } else {
                    throw AnonymousClass001.A0c("Unsupported StatusItem instance");
                }
            } else {
                C91654kd r03 = (C91654kd) this;
                MediaComposerActivity mediaComposerActivity2 = r03.A00;
                Uri uri = (Uri) AnonymousClass4SG.A31(mediaComposerActivity2).get(r03.A0M(i));
                byte A012 = mediaComposerActivity2.A0o.A01(AnonymousClass4SG.A2l(uri, mediaComposerActivity2));
                if (A012 == 1) {
                    gifComposerFragment = new ImageComposerFragment();
                } else if (A012 == 3) {
                    gifComposerFragment = new VideoComposerFragment();
                } else if (A012 != 13) {
                    statusPlaybackContactFragment = null;
                } else {
                    gifComposerFragment = new GifComposerFragment();
                }
                Bundle A082 = AnonymousClass002.A08();
                A082.putParcelable("uri", uri);
                gifComposerFragment.A0u(A082);
                statusPlaybackContactFragment = gifComposerFragment;
            }
            AnonymousClass0ZZ r04 = (AnonymousClass0ZZ) this.A03.A05(A0B, (Object) null);
            if (r04 != null) {
                statusPlaybackContactFragment.A0z(r04);
            }
            statusPlaybackContactFragment.A14(false);
            statusPlaybackContactFragment.A15(false);
            r5.A0A(A0B, statusPlaybackContactFragment);
            this.A00.A0D(statusPlaybackContactFragment, AnonymousClass000.A0Z("f", AnonymousClass001.A0o(), A0B), viewGroup.getId());
            statusPlaybackContactFragment3 = statusPlaybackContactFragment;
        }
        return statusPlaybackContactFragment3;
    }

    public Parcelable A03() {
        Bundle bundle;
        C10550i7 r7 = this.A03;
        int i = 0;
        if (r7.A01() > 0) {
            bundle = AnonymousClass002.A08();
            long[] jArr = new long[r7.A01()];
            for (int i2 = 0; i2 < r7.A01(); i2++) {
                long A022 = r7.A02(i2);
                jArr[i2] = A022;
                bundle.putParcelable(Long.toString(A022), (AnonymousClass0ZZ) r7.A04(i2));
            }
            bundle.putLongArray("states", jArr);
        } else {
            bundle = null;
        }
        while (true) {
            C10550i7 r1 = this.A02;
            if (i >= r1.A01()) {
                return bundle;
            }
            C08310eF r3 = (C08310eF) r1.A04(i);
            if (r3 != null && r3.A16()) {
                if (bundle == null) {
                    bundle = AnonymousClass002.A08();
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("f");
                this.A04.A0U(bundle, r3, AnonymousClass001.A0k(A0o, r1.A02(i)));
            }
            i++;
        }
    }

    public void A08(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            long[] longArray = bundle.getLongArray("states");
            C10550i7 r7 = this.A03;
            r7.A06();
            C10550i7 r5 = this.A02;
            r5.A06();
            if (longArray != null) {
                for (long j : longArray) {
                    r7.A0A(j, bundle.getParcelable(Long.toString(j)));
                }
            }
            Iterator<T> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                if (A0m.startsWith("f")) {
                    C08310eF A0C = this.A04.A0C(bundle, A0m);
                    if (A0C != null) {
                        A0C.A14(false);
                        r5.A0A(Long.parseLong(A0m.substring(1)), A0C);
                    } else {
                        C18260x0.A0t("FragmentPagerAdapter/Bad fragment at key ", A0m, AnonymousClass001.A0o());
                    }
                }
            }
        }
    }

    public void A09(ViewGroup viewGroup) {
        C08240dc r0 = this.A00;
        if (r0 != null) {
            r0.A04();
            this.A00 = null;
        }
    }

    public /* bridge */ /* synthetic */ void A0J(ViewGroup viewGroup, Object obj, int i) {
        C08310eF r4 = (C08310eF) obj;
        C08310eF r0 = this.A01;
        if (r4 != r0) {
            if (r0 != null) {
                r0.A14(false);
                this.A01.A15(false);
            }
            r4.A14(true);
            r4.A15(true);
            this.A01 = r4;
        }
    }

    public /* bridge */ /* synthetic */ boolean A0K(View view, Object obj) {
        return AnonymousClass000.A1Y(((C08310eF) obj).A0B, view);
    }

    public C89084bS(C08270df r2) {
        this.A04 = r2;
    }

    public void A0A(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ViewPager with adapter ");
            A0o.append(this);
            throw AnonymousClass000.A0I(" requires a view id", A0o);
        }
    }

    /* renamed from: A0L */
    public void A0I(ViewGroup viewGroup, C08310eF r10, int i) {
        long j;
        int A0G = A0G(r10);
        C10550i7 r7 = this.A02;
        if (r7.A01) {
            r7.A07();
        }
        int i2 = 0;
        while (true) {
            if (i2 >= r7.A00) {
                break;
            }
            Object[] objArr = r7.A03;
            if (objArr[i2] != r10) {
                i2++;
            } else if (i2 != -1) {
                j = r7.A02(i2);
                Object obj = objArr[i2];
                Object obj2 = C10550i7.A04;
                if (obj != obj2) {
                    objArr[i2] = obj2;
                    r7.A01 = true;
                }
            }
        }
        j = -1;
        if (!r10.A16() || A0G == -2) {
            this.A03.A08(j);
        } else {
            this.A03.A0A(j, this.A04.A0A(r10));
        }
        C08240dc r1 = this.A00;
        if (r1 == null) {
            r1 = new C08240dc(this.A04);
            this.A00 = r1;
        }
        r1.A07(r10);
    }
}

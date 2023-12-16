package X;

import android.content.res.Resources;
import android.os.Handler;
import com.whatsapp.R;
import com.whatsapp.media.download.service.MediaDownloadService;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.util.Log;
import java.util.AbstractList;
import java.util.Iterator;

/* renamed from: X.4Jm  reason: invalid class name and case insensitive filesystem */
public class C86274Jm implements C84134Bd {
    public int A00;
    public Object A01;
    public final int A02;

    public final void AwB(Object obj) {
        boolean z;
        Resources resources;
        int i;
        String quantityString;
        Resources resources2;
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Object obj2 = obj;
        switch (this.A02) {
            case 0:
                AnonymousClass3XH r5 = (AnonymousClass3XH) this.A01;
                int i5 = this.A00;
                C30471mV r9 = (C30471mV) obj2;
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A0o(C624134x.A08(r9, "mediaautodownload/updatequeue/foreach message.key=", A0o), A0o);
                C620133d r3 = r5.A07;
                AnonymousClass1I7 A03 = r3.A03(r9);
                if (A03 == null) {
                    Log.i("mediaautodownload/updatequeue/foreach message skipped");
                    return;
                } else if (A03.A12 != 0) {
                    C55572qZ r1 = r5.A06;
                    if (r1.A03(r9)) {
                        i4 = 1;
                    } else if (r1.A04(r9, i5)) {
                        i4 = 2;
                    } else {
                        r3.A0B(r9);
                        return;
                    }
                    A03.A12 = i4;
                    C56852sf r12 = A03.A0h;
                    synchronized (r12) {
                        r12.A00 = i4;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                MediaDownloadService mediaDownloadService = (MediaDownloadService) this.A01;
                int i6 = this.A00;
                AbstractList abstractList = (AbstractList) obj2;
                if (!abstractList.isEmpty()) {
                    if (abstractList.isEmpty()) {
                        quantityString = null;
                    } else {
                        Object obj3 = abstractList.get(0);
                        if (!abstractList.isEmpty()) {
                            byte b = ((C624134x) abstractList.get(0)).A1I;
                            Iterator it = abstractList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                } else if (C18300x5.A0T(it).A1I != b) {
                                }
                            }
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (obj3 instanceof AnonymousClass1nF) {
                                resources = mediaDownloadService.getResources();
                                i = R.plurals.f9nameremoved;
                            } else if (obj3 instanceof C31971pB) {
                                resources = mediaDownloadService.getResources();
                                i = R.plurals.f9nameremoved;
                            }
                            int size = abstractList.size();
                            Object[] objArr2 = new Object[1];
                            AnonymousClass000.A1P(objArr2, abstractList.size(), 0);
                            quantityString = resources.getQuantityString(i, size, objArr2);
                        }
                        resources = mediaDownloadService.getResources();
                        i = R.plurals.f9nameremoved;
                        int size2 = abstractList.size();
                        Object[] objArr22 = new Object[1];
                        AnonymousClass000.A1P(objArr22, abstractList.size(), 0);
                        quantityString = resources.getQuantityString(i, size2, objArr22);
                    }
                    String str = null;
                    if (!abstractList.isEmpty()) {
                        C30471mV r52 = (C30471mV) abstractList.get(0);
                        if (!(r52 instanceof AnonymousClass1nF)) {
                            C95814uZ r2 = r52.A1J.A00;
                            if (r2 != null) {
                                String A022 = C106815aD.A02(mediaDownloadService.A01.A0H(mediaDownloadService.A00.A0A(r2)));
                                if (abstractList.size() == 1) {
                                    str = AnonymousClass0x2.A0X(mediaDownloadService, A022, 1, R.string.f11nameremoved);
                                } else {
                                    resources2 = mediaDownloadService.getResources();
                                    i2 = R.plurals.f9nameremoved;
                                    i3 = AnonymousClass0x9.A03(abstractList, 1);
                                    objArr = new Object[2];
                                    objArr[0] = A022;
                                }
                            }
                        } else if (abstractList.size() == 1) {
                            str = r52.A1x();
                        } else {
                            resources2 = mediaDownloadService.getResources();
                            i2 = R.plurals.f9nameremoved;
                            i3 = AnonymousClass0x9.A03(abstractList, 1);
                            objArr = new Object[2];
                            objArr[0] = r52.A1x();
                        }
                        AnonymousClass000.A1P(objArr, AnonymousClass0x9.A03(abstractList, 1), 1);
                        str = resources2.getQuantityString(i2, i3, objArr);
                    }
                    ((Handler) mediaDownloadService.A09.get()).post(new C70653aq(mediaDownloadService, abstractList, quantityString, str, i6, 1));
                    return;
                }
                mediaDownloadService.A01.A03(mediaDownloadService.A02.A00, AnonymousClass0x9.A09("com.whatsapp.media.download.service.MediaDownloadService.DOWNLOADS_COMPLETED"), MediaDownloadService.class);
                return;
            default:
                A00(this, obj);
                return;
        }
    }

    public C86274Jm(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public static final void A00(C86274Jm r6, Object obj) {
        ReactionsTrayViewModel reactionsTrayViewModel = (ReactionsTrayViewModel) r6.A01;
        int i = r6.A00;
        if (((Boolean) obj).booleanValue()) {
            reactionsTrayViewModel.A00 = i;
            C58742vk r0 = reactionsTrayViewModel.A0B;
            C624134x r4 = reactionsTrayViewModel.A0G;
            r0.A01.BhD(C58742vk.A00(AnonymousClass29K.A01(r0.A00, r4, r0.A02, r0.A03), AnonymousClass36M.A06(r4), 1));
            C06270Wx.A04(reactionsTrayViewModel.A0C, 1);
        }
    }
}

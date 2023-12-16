package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.gallery.GalleryRecentsFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.4XI  reason: invalid class name */
public class AnonymousClass4XI extends AnonymousClass0R6 implements C185858uM {
    public long A00;
    public final AnonymousClass1VX A01;
    public final MediaGalleryFragmentBase A02;
    public final MediaGalleryFragmentBase A03;
    public final Map A04 = AnonymousClass001.A0t();

    public void A0J(C05570Ua r3) {
        C162457s7.A0J(r3, 0);
        if (r3 instanceof AnonymousClass6IG) {
            C95294tG r1 = ((AnonymousClass6IG) r3).A00;
            r1.setImageBitmap((Bitmap) null);
            r1.A06 = null;
        }
    }

    public void BNf(C05570Ua r12, int i) {
        int i2;
        C72173dI r3;
        int indexOf;
        C53492nB r4;
        C179338iz r42;
        C162457s7.A0J(r12, 0);
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A02;
        StickyHeadersRecyclerView stickyHeadersRecyclerView = mediaGalleryFragmentBase.A0C;
        if (stickyHeadersRecyclerView != null) {
            i2 = stickyHeadersRecyclerView.getChildCount();
        } else {
            i2 = 0;
        }
        if (mediaGalleryFragmentBase.A00 < i2) {
            mediaGalleryFragmentBase.A00 = i2;
            StickyHeadersRecyclerView stickyHeadersRecyclerView2 = mediaGalleryFragmentBase.A0C;
            if (stickyHeadersRecyclerView2 != null) {
                AnonymousClass0M7 A002 = stickyHeadersRecyclerView2.getRecycledViewPool().A00(1);
                A002.A00 = i2;
                ArrayList arrayList = A002.A03;
                while (arrayList.size() > i2) {
                    arrayList.remove(C86664Kz.A0M(arrayList));
                }
            }
        }
        if (r12 instanceof AnonymousClass6IG) {
            AnonymousClass6IG r122 = (AnonymousClass6IG) r12;
            View view = r122.A0H;
            C162457s7.A0K(view, "null cannot be cast to non-null type com.whatsapp.gallery.MediaItemView");
            C95294tG r6 = (C95294tG) view;
            r6.A06 = null;
            C86644Kx.A1A(r6);
            C186308v5 r0 = mediaGalleryFragmentBase.A0L;
            if (r0 != null) {
                C186058ug B9S = r0.B9S(i);
                C162457s7.A0K(view, "null cannot be cast to non-null type com.whatsapp.gallery.MediaItemView");
                r6.setMediaItem(B9S);
                Integer num = null;
                if ((r6 instanceof C179338iz) && (r42 = (C179338iz) r6) != null) {
                    ((AnonymousClass4t2) r42).A0B = AnonymousClass000.A1U(mediaGalleryFragmentBase.A03, 3);
                }
                if ((r6.getTag() instanceof C84584Cx) && (r4 = mediaGalleryFragmentBase.A0Q) != null) {
                    Object tag = r6.getTag();
                    C162457s7.A0K(tag, "null cannot be cast to non-null type com.whatsapp.gallerypicker.MediaThumbLoader.BitmapLoader");
                    r4.A01((C84584Cx) tag);
                }
                if (B9S != null) {
                    C114245mj r9 = new C114245mj(B9S, r6, r122, this);
                    r6.setTag(r9);
                    C1234268j r5 = new C1234268j(r6, this, B9S, r9, 0);
                    C53492nB r02 = mediaGalleryFragmentBase.A0Q;
                    if (r02 != null) {
                        r02.A02(r9, r5);
                    }
                    if (mediaGalleryFragmentBase instanceof MediaPickerFragment) {
                        MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) mediaGalleryFragmentBase;
                        HashSet hashSet = mediaPickerFragment.A0L;
                        Uri B3d = B9S.B3d();
                        if (C73723fy.A0U(hashSet, B3d)) {
                            C113975mI r03 = mediaPickerFragment.A0S;
                            if (r03 == null) {
                                throw C18270x1.A0S("mediaTray");
                            } else if (r03.A00.A0X(4168)) {
                                indexOf = C73723fy.A0F(hashSet).indexOf(B3d);
                            }
                        }
                        r6.setCheckedPosition(num);
                        r6.setChecked(mediaGalleryFragmentBase.A1W(i));
                    } else {
                        if (mediaGalleryFragmentBase instanceof GalleryRecentsFragment) {
                            GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) mediaGalleryFragmentBase;
                            Map map = galleryRecentsFragment.A08;
                            Uri B3d2 = B9S.B3d();
                            C162457s7.A0D(B3d2);
                            if (map.containsKey(B3d2)) {
                                C113975mI r04 = galleryRecentsFragment.A0S;
                                if (r04 == null) {
                                    throw C18270x1.A0S("mediaTray");
                                } else if (r04.A00.A0X(4168)) {
                                    indexOf = C73723fy.A0F(C73723fy.A0C(map.values())).indexOf(B9S);
                                }
                            }
                        }
                        r6.setCheckedPosition(num);
                        r6.setChecked(mediaGalleryFragmentBase.A1W(i));
                    }
                    num = Integer.valueOf(indexOf);
                    r6.setCheckedPosition(num);
                    r6.setChecked(mediaGalleryFragmentBase.A1W(i));
                } else {
                    C86664Kz.A1R(r6);
                    r6.setBackgroundColor(mediaGalleryFragmentBase.A02);
                    r6.setImageDrawable((Drawable) null);
                    r6.setCheckedPosition((Integer) null);
                    r6.setChecked(false);
                }
                if (!mediaGalleryFragmentBase.A0Z) {
                    mediaGalleryFragmentBase.A0Z = true;
                    r6.getViewTreeObserver().addOnPreDrawListener(new C1893691a(mediaGalleryFragmentBase, 2, r6));
                }
                if (B9S == null && this.A01.A0X(5882) && (r3 = mediaGalleryFragmentBase.A0U) != null) {
                    r3.execute(new C117705sM((Object) mediaGalleryFragmentBase, i, 32));
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ C05570Ua BQN(ViewGroup viewGroup) {
        C162457s7.A0J(viewGroup, 0);
        C620733j A1K = this.A02.A1K();
        View inflate = C86604Kt.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
        AnonymousClass0YH.A06(inflate, C620733j.A04(A1K) ^ true ? 1 : 0);
        inflate.setClickable(false);
        AnonymousClass6IU r3 = new AnonymousClass6IU(inflate);
        TextView textView = r3.A01;
        AnonymousClass0x2.A0q(textView.getContext(), textView, R.color.f5nameremoved);
        return r3;
    }

    public static int A00(MediaGalleryFragmentBase mediaGalleryFragmentBase, int i) {
        return ((C118305tK) ((C179328iy) mediaGalleryFragmentBase.A0d.get(i))).count;
    }

    public long A0B(int i) {
        C186058ug r3;
        C186308v5 r0 = this.A02.A0L;
        if (r0 != null) {
            r3 = r0.B9S(i);
        } else {
            r3 = null;
        }
        if (!this.A00 || r3 == null) {
            return 0;
        }
        Uri B3d = r3.B3d();
        C162457s7.A0D(B3d);
        if (B3d == Uri.EMPTY) {
            return 0;
        }
        Map map = this.A04;
        Number A0q = AnonymousClass0x9.A0q(B3d, map);
        if (A0q == null) {
            long j = this.A00;
            this.A00 = 1 + j;
            A0q = Long.valueOf(j);
            map.put(B3d, A0q);
        }
        return A0q.longValue();
    }

    public int A0G() {
        boolean A0X = this.A01.A0X(4647);
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A02;
        if (!A0X) {
            return mediaGalleryFragmentBase.A01;
        }
        C186308v5 r0 = mediaGalleryFragmentBase.A0L;
        if (r0 != null) {
            return r0.getCount();
        }
        return 0;
    }

    public final void A0K(AnonymousClass6IU r8, StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment, int i) {
        int i2;
        AnonymousClass677 r1;
        boolean z;
        C186058ug r12;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A02;
        if (mediaGalleryFragmentBase.A0X && mediaGalleryFragmentBase.A0L != null) {
            boolean isChecked = r8.A00.isChecked();
            C186308v5 r0 = mediaGalleryFragmentBase.A0L;
            int i3 = 0;
            if (r0 != null) {
                i2 = r0.getCount();
            } else {
                i2 = 0;
            }
            int i4 = i2 - 1;
            int i5 = mediaGalleryFragmentBase.A03;
            if (i5 == 0 || i5 == 1) {
                int i6 = 0;
                while (i3 < i) {
                    int A002 = A00(mediaGalleryFragmentBase, i3);
                    if (i3 == i) {
                        i4 = (A002 + i6) - 1;
                    } else {
                        i6 += A002;
                    }
                    i3++;
                }
                i3 = i6;
            }
            ArrayList A0s = AnonymousClass001.A0s();
            if (i3 <= i4) {
                while (true) {
                    C186308v5 r02 = mediaGalleryFragmentBase.A0L;
                    if (r02 != null) {
                        r12 = r02.B9S(i3);
                    } else {
                        r12 = null;
                    }
                    if (r12 instanceof AnonymousClass8GZ) {
                        A0s.add(((AnonymousClass8GZ) r12).A03);
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3++;
                }
            }
            int size = A0s.size();
            if (isChecked) {
                if (size != 0) {
                    if (!storageUsageMediaGalleryFragment.A1V()) {
                        ((AnonymousClass677) storageUsageMediaGalleryFragment.A0R()).Bpx((C624134x) AnonymousClass0x9.A0t(A0s));
                    }
                    r1 = (AnonymousClass677) storageUsageMediaGalleryFragment.A0R();
                    z = true;
                } else {
                    return;
                }
            } else if (size != 0) {
                r1 = (AnonymousClass677) storageUsageMediaGalleryFragment.A0R();
                z = false;
            } else {
                return;
            }
            r1.BnL(A0s, z);
            storageUsageMediaGalleryFragment.A1P();
        }
    }

    public int B62(int i) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A02;
        int i2 = mediaGalleryFragmentBase.A03;
        if (i2 == 0 || i2 == 1) {
            return A00(mediaGalleryFragmentBase, i);
        }
        return mediaGalleryFragmentBase.A01;
    }

    public int B83() {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A02;
        int i = mediaGalleryFragmentBase.A03;
        if (i == 0 || i == 1) {
            return mediaGalleryFragmentBase.A0d.size();
        }
        return 1;
    }

    public long B84(int i) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A02;
        int i2 = mediaGalleryFragmentBase.A03;
        if (i2 == 0 || i2 == 1) {
            return -((Calendar) ((C179328iy) mediaGalleryFragmentBase.A0d.get(i))).getTimeInMillis();
        }
        return 1;
    }

    public /* bridge */ /* synthetic */ void BNd(C05570Ua r8, int i) {
        boolean z;
        TextView textView;
        int i2;
        AnonymousClass6IU r82 = (AnonymousClass6IU) r8;
        int i3 = 0;
        C162457s7.A0J(r82, 0);
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A02;
        int i4 = mediaGalleryFragmentBase.A03;
        if (i4 == 0 || i4 == 1) {
            r82.A01.setText(mediaGalleryFragmentBase.A0d.get(i).toString());
        } else {
            if (i4 == 2) {
                textView = r82.A01;
                i2 = R.string.f11nameremoved;
            } else if (i4 == 3) {
                textView = r82.A01;
                i2 = R.string.f11nameremoved;
            }
            textView.setText(i2);
        }
        if (mediaGalleryFragmentBase.A0Y) {
            CheckBox checkBox = r82.A00;
            checkBox.setVisibility(0);
            checkBox.setEnabled(mediaGalleryFragmentBase.A0X);
            C186308v5 r1 = mediaGalleryFragmentBase.A0L;
            if (r1 != null && mediaGalleryFragmentBase.A0X) {
                int count = r1.getCount() - 1;
                int i5 = mediaGalleryFragmentBase.A03;
                if ((i5 == 0 || i5 == 1) && i >= 0) {
                    int i6 = 0;
                    while (true) {
                        if (i6 == i) {
                            count = (A00(mediaGalleryFragmentBase, i6) + i3) - 1;
                        } else {
                            i3 += A00(mediaGalleryFragmentBase, i6);
                        }
                        if (i6 == i) {
                            break;
                        }
                        i6++;
                    }
                }
                if (i3 <= count) {
                    while (true) {
                        if (mediaGalleryFragmentBase.A1W(i3)) {
                            if (i3 == count) {
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                }
                z = true;
                checkBox.setChecked(z);
                C109715f4.A00(checkBox, this, r82, i, 10);
                return;
            }
            z = false;
            checkBox.setChecked(z);
            C109715f4.A00(checkBox, this, r82, i, 10);
            return;
        }
        r82.A00.setVisibility(8);
        r82.A0H.setOnClickListener((View.OnClickListener) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (r0.A00.A0X(4261) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C05570Ua BQR(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            com.whatsapp.gallery.MediaGalleryFragmentBase r3 = r5.A03
            com.whatsapp.gallery.MediaGalleryFragmentBase r1 = r5.A02
            boolean r0 = r1 instanceof com.whatsapp.storage.StorageUsageMediaGalleryFragment
            if (r0 == 0) goto L_0x0017
            X.03q r0 = r1.A0Q()
            X.4t2 r4 = new X.4t2
            r4.<init>(r0)
        L_0x0011:
            X.6IG r0 = new X.6IG
            r0.<init>(r3, r4)
            return r0
        L_0x0017:
            boolean r0 = r1 instanceof com.whatsapp.gallerypicker.MediaPickerFragment
            if (r0 == 0) goto L_0x002d
            com.whatsapp.gallerypicker.MediaPickerFragment r1 = (com.whatsapp.gallerypicker.MediaPickerFragment) r1
            X.03q r0 = r1.A0Q()
            X.6iu r4 = new X.6iu
            r4.<init>(r0)
            boolean r0 = r1.A1c()
            r4.A0D = r0
            goto L_0x0011
        L_0x002d:
            boolean r0 = r1 instanceof com.whatsapp.gallery.MediaGalleryFragment
            if (r0 == 0) goto L_0x003e
            X.03q r0 = r1.A0Q()
            X.4t2 r4 = new X.4t2
            r4.<init>(r0)
            r0 = 2
            r4.A00 = r0
            goto L_0x0011
        L_0x003e:
            com.whatsapp.gallery.GalleryRecentsFragment r1 = (com.whatsapp.gallery.GalleryRecentsFragment) r1
            X.03q r0 = r1.A0Q()
            X.6iu r4 = new X.6iu
            r4.<init>(r0)
            com.whatsapp.gallery.GalleryTabHostFragment r0 = r1.A03
            r2 = 1
            if (r0 == 0) goto L_0x0065
            boolean r0 = r0.A1T()
            if (r0 != r2) goto L_0x0065
            X.5mI r0 = r1.A0S
            if (r0 == 0) goto L_0x0067
            X.1VX r1 = r0.A00
            r0 = 4261(0x10a5, float:5.971E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0065
        L_0x0062:
            r4.A0D = r2
            goto L_0x0011
        L_0x0065:
            r2 = 0
            goto L_0x0062
        L_0x0067:
            java.lang.String r0 = "mediaTray"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XI.BQR(android.view.ViewGroup, int):X.0Ua");
    }

    public /* bridge */ /* synthetic */ boolean Bck(MotionEvent motionEvent, C05570Ua r6, int i) {
        AnonymousClass6IU r62 = (AnonymousClass6IU) r6;
        C18260x0.A0P(r62, motionEvent);
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A02;
        if (!mediaGalleryFragmentBase.A0Y) {
            return false;
        }
        float x = motionEvent.getX();
        CheckBox checkBox = r62.A00;
        if (x < checkBox.getX() || !mediaGalleryFragmentBase.A0X) {
            return false;
        }
        checkBox.setChecked(!checkBox.isChecked());
        A0K(r62, (StorageUsageMediaGalleryFragment) mediaGalleryFragmentBase, i);
        return true;
    }

    public AnonymousClass4XI(AnonymousClass1VX r2, MediaGalleryFragmentBase mediaGalleryFragmentBase, MediaGalleryFragmentBase mediaGalleryFragmentBase2) {
        this.A01 = r2;
        this.A03 = mediaGalleryFragmentBase;
        this.A02 = mediaGalleryFragmentBase2;
    }
}

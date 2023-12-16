package com.whatsapp.newsletter.ui.profilephoto;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0X0;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1RL;
import X.AnonymousClass30B;
import X.AnonymousClass3ZH;
import X.AnonymousClass4SG;
import X.AnonymousClass4q2;
import X.AnonymousClass5MG;
import X.AnonymousClass5ZU;
import X.AnonymousClass7ZM;
import X.AnonymousClass8GA;
import X.AnonymousClass8JC;
import X.AnonymousClass8WV;
import X.AnonymousClass91K;
import X.C02680He;
import X.C105025Tg;
import X.C105365Uq;
import X.C106575Zn;
import X.C107275b2;
import X.C107395bF;
import X.C107695bk;
import X.C113315lE;
import X.C114015mM;
import X.C119995xs;
import X.C124186Bh;
import X.C124726Dq;
import X.C141986wS;
import X.C151977Xa;
import X.C162457s7;
import X.C175738Zn;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18320x8;
import X.C30181m2;
import X.C44142Uv;
import X.C56332ro;
import X.C56452s0;
import X.C56512s6;
import X.C56842se;
import X.C56972sr;
import X.C56982ss;
import X.C613330g;
import X.C627536m;
import X.C64333Db;
import X.C64393Dh;
import X.C64773Ex;
import X.C73153f1;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C88834as;
import X.C94184qG;
import X.C95804uY;
import X.C95814uZ;
import X.C97564yl;
import X.C989053r;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class ViewNewsletterProfilePhoto extends C97564yl {
    public C44142Uv A00;
    public C105365Uq A01;
    public C114015mM A02;
    public C613330g A03;
    public C56982ss A04;
    public AnonymousClass3ZH A05;
    public C56842se A06;
    public C30181m2 A07;
    public C94184qG A08;
    public C141986wS A09;
    public C56452s0 A0A;
    public C989053r A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Handler A0F;

    public final void A79() {
        C30181m2 r0 = this.A07;
        if (r0 == null) {
            throw C18270x1.A0S("photoUpdater");
        }
        AnonymousClass3ZH r2 = this.A05;
        if (r2 == null) {
            throw C18270x1.A0S("tempContact");
        }
        r0.A08(this, r2, 12, 1, -1, this.A0C, true, true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C162457s7.A0J(menu, 0);
        AnonymousClass1RL A78 = A78();
        if (A78 != null && A78.A0K()) {
            menu.add(0, R.id.menuitem_edit, 0, R.string.f11nameremoved).setIcon(R.drawable.ic_action_edit).setShowAsAction(2);
            C86654Ky.A12(menu.add(0, 1, 0, R.string.f11nameremoved), R.drawable.ic_action_share, 2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        AnonymousClass1RL A78;
        boolean z;
        boolean z2;
        C162457s7.A0J(menu, 0);
        if (menu.size() > 0 && (A78 = A78()) != null && A78.A0K()) {
            MenuItem findItem = menu.findItem(1);
            if (findItem != null) {
                C56332ro r1 = this.A06;
                if (r1 != null) {
                    File A002 = r1.A00(A75());
                    if (A002 != null) {
                        z2 = A002.exists();
                    } else {
                        z2 = false;
                    }
                    findItem.setVisible(z2);
                } else {
                    throw C18270x1.A0S("contactPhotoHelper");
                }
            }
            MenuItem findItem2 = menu.findItem(R.id.menuitem_edit);
            if (findItem2 != null) {
                AnonymousClass1RL A782 = A78();
                if (A782 != null) {
                    z = A782.A0K();
                } else {
                    z = false;
                }
                findItem2.setVisible(z);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void A5r() {
        if (!this.A0D) {
            this.A0D = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r4 = A2X.A4Z;
            AnonymousClass4SG.A3W(r4, this);
            C107695bk r1 = r4.A00;
            AnonymousClass4SG.A3Q(r4, r1, this, AnonymousClass4SG.A2t(r4, r1, this));
            this.A03 = C86624Kv.A0M(r4);
            this.A0C = C86614Ku.A0j(r4);
            this.A0A = r4.Akp();
            this.A04 = C64333Db.A26(r4);
            this.A05 = C64333Db.A28(r4);
            this.A07 = C86664Kz.A18(r4);
            this.A06 = (C56332ro) r4.A6Q.get();
            this.A08 = C64333Db.A2r(r4);
            this.A04 = C64333Db.A39(r4);
            this.A02 = C64333Db.A29(r4);
            this.A0B = C86614Ku.A0m(r4);
            this.A0A = (C56452s0) r4.ARi.get();
            this.A08 = new C94184qG(C86634Kw.A0a(r4), C86614Ku.A0U(r4), C86604Kt.A0g(r4));
            this.A06 = C64333Db.A66(r4);
            this.A00 = (C44142Uv) A2X.A1b.get();
            this.A03 = C86624Kv.A0P(r4);
        }
    }

    public final AnonymousClass1RL A78() {
        C56982ss r1 = this.A04;
        if (r1 != null) {
            return (AnonymousClass1RL) C56982ss.A00(r1, A75().A0H);
        }
        throw C18270x1.A0S("chatsCache");
    }

    public final void A7A(boolean z) {
        C94184qG r0 = this.A08;
        if (r0 != null) {
            AnonymousClass4q2 r02 = r0.A00;
            if (r02 == null || !(!r02.A00.A04())) {
                C94184qG r4 = this.A08;
                if (r4 != null) {
                    AnonymousClass3ZH A75 = A75();
                    C113315lE r3 = new C113315lE(this, z);
                    C86604Kt.A1R(r4.A00);
                    r4.A00 = null;
                    AnonymousClass4q2 r2 = new AnonymousClass4q2(A75, r4);
                    r4.A02(new AnonymousClass91K(r4, 2, r3), r2);
                    r4.A00 = r2;
                    return;
                }
                throw C18270x1.A0S("newsletterPhotoLoader");
            }
            return;
        }
        throw C18270x1.A0S("newsletterPhotoLoader");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Object r3;
        byte[] bArr;
        Uri fromFile;
        Intent intent2 = intent;
        if (i != 12) {
            if (i != 13) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            C30181m2 r0 = this.A07;
            if (r0 == null) {
                throw C18270x1.A0S("photoUpdater");
            }
            if (!r0.A02().delete()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("ViewNewsletterProfilePhoto/failed-delete-file");
                C30181m2 r02 = this.A07;
                if (r02 == null) {
                    throw C18270x1.A0S("photoUpdater");
                }
                C18260x0.A1M(A0o, r02.A02().getAbsolutePath());
            }
            if (i2 == -1) {
                this.A09 = C141986wS.CROPPED;
                this.A0D = true;
                r3 = new C119995xs(this);
            } else if (i2 == 0 && intent != null) {
                C30181m2 r03 = this.A07;
                if (r03 == null) {
                    throw C18270x1.A0S("photoUpdater");
                }
                r03.A04(intent, this);
                return;
            } else {
                return;
            }
        } else if (i2 == -1) {
            if (intent != null) {
                if (intent.getBooleanExtra("is_reset", false)) {
                    this.A09 = C141986wS.DELETED;
                    r3 = new AnonymousClass8WV(this);
                } else if (intent.getBooleanExtra("skip_cropping", false)) {
                    this.A09 = C141986wS.NOT_CROPPED;
                    r3 = new C119995xs(this);
                }
            }
            C30181m2 r6 = this.A07;
            if (r6 == null) {
                throw C18270x1.A0S("photoUpdater");
            }
            AnonymousClass3ZH r10 = this.A05;
            if (r10 == null) {
                throw C18270x1.A0S("tempContact");
            }
            r6.A06(intent2, this, this, r10, 13);
            return;
        } else {
            return;
        }
        Bp9(R.string.f11nameremoved);
        AnonymousClass1RL A78 = A78();
        if (A78 != null) {
            C56842se r4 = this.A06;
            if (r4 != null) {
                C95814uZ r5 = A75().A0H;
                C162457s7.A0K(r5, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
                C95804uY r52 = (C95804uY) r5;
                String str = A78.A0H;
                int ordinal = this.A09.ordinal();
                if (ordinal == 2 || ordinal == 1) {
                    C56332ro r1 = this.A06;
                    if (r1 != null) {
                        AnonymousClass3ZH r04 = this.A05;
                        if (r04 == null) {
                            throw C18270x1.A0S("tempContact");
                        }
                        File A002 = r1.A00(r04);
                        if (!(A002 == null || !A002.exists() || (fromFile = Uri.fromFile(A002)) == null)) {
                            C989053r r05 = this.A0B;
                            if (r05 != null) {
                                File A0E2 = r05.A0E(fromFile);
                                if (A0E2 != null) {
                                    bArr = C627536m.A0U(A0E2);
                                }
                            } else {
                                throw C18270x1.A0S("mediaFileUtils");
                            }
                        }
                        bArr = null;
                    } else {
                        throw C18270x1.A0S("contactPhotoHelper");
                    }
                } else {
                    if (!(ordinal == 3 || ordinal == 0)) {
                        throw C73153f1.A00();
                    }
                    bArr = null;
                }
                r4.A0B(r52, new C124186Bh(r3, 2, this), str, (String) null, bArr, false, true);
                return;
            }
            throw C18270x1.A0S("newsletterManager");
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        Intent intent = getIntent();
        C162457s7.A0D(intent);
        int intExtra = intent.getIntExtra("start_transition_status_bar_color", 0);
        int intExtra2 = intent.getIntExtra("return_transition_status_bar_color", intExtra);
        int intExtra3 = intent.getIntExtra("start_transition_navigation_bar_color", 0);
        AnonymousClass7ZM r9 = new AnonymousClass7ZM(intExtra, intExtra3, intExtra2, intent.getIntExtra("return_transition_navigation_bar_color", intExtra3));
        C106575Zn.A01(this, r9, new C151977Xa());
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A00 = C18290x4.A0N(this, R.id.progress_bar);
        PhotoView photoView = (PhotoView) C18290x4.A0N(this, R.id.picture);
        C162457s7.A0J(photoView, 0);
        this.A0B = photoView;
        TextView textView = (TextView) C18290x4.A0N(this, R.id.message);
        C162457s7.A0J(textView, 0);
        this.A02 = textView;
        ImageView imageView = (ImageView) C18290x4.A0N(this, R.id.picture_animation);
        C162457s7.A0J(imageView, 0);
        this.A01 = imageView;
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        setSupportActionBar(A28);
        AnonymousClass1Ha.A1z(this);
        C162457s7.A0H(A28);
        C95804uY A012 = C95804uY.A03.A01(AnonymousClass0x7.A0l(this));
        if (A012 != null) {
            C64773Ex r0 = this.A04;
            if (r0 != null) {
                this.A09 = r0.A0A(A012);
                StringBuilder A0l = AnonymousClass000.A0l(C56972sr.A05(this.A01).user);
                A0l.append('-');
                String A0X = AnonymousClass000.A0X(C175738Zn.A0U(C86604Kt.A0k(), "-", "", false), A0l);
                C162457s7.A0J(A0X, 0);
                C95804uY A032 = C95804uY.A02.A03(A0X, "newsletter");
                C162457s7.A0D(A032);
                A032.A00 = true;
                AnonymousClass3ZH r1 = new AnonymousClass3ZH(A032);
                AnonymousClass1RL A78 = A78();
                if (!(A78 == null || (str2 = A78.A0H) == null)) {
                    r1.A0P = str2;
                }
                this.A05 = r1;
                AnonymousClass1RL A782 = A78();
                if (A782 != null) {
                    C114015mM r12 = this.A02;
                    if (r12 != null) {
                        this.A01 = r12.A06(this, "newsletter-profile-pic-activity");
                        boolean A1W = AnonymousClass000.A1W(A782.A0J);
                        this.A0C = A1W;
                        C44142Uv r02 = this.A00;
                        if (r02 != null) {
                            this.A07 = r02.A00(A1W);
                            AnonymousClass5ZU r13 = this.A05;
                            if (r13 != null) {
                                A6e(r13.A0H(A75()));
                                C56512s6 r5 = this.A07;
                                if (r5 != null) {
                                    C105025Tg r4 = this.A0C;
                                    if (r4 != null) {
                                        if (r5.A08(new AnonymousClass8GA(this, new AnonymousClass8JC(), r4))) {
                                            C56452s0 r42 = this.A0A;
                                            if (r42 != null) {
                                                r42.A01(AnonymousClass3ZH.A01(A75()), A75().A05, 1);
                                                AnonymousClass1RL A783 = A78();
                                                if (A783 == null || (str = A783.A0J) == null || str.length() == 0) {
                                                    this.A0F.sendEmptyMessageDelayed(0, 32000);
                                                }
                                            } else {
                                                throw C18270x1.A0S("profilePhotoManager");
                                            }
                                        }
                                        C613330g r10 = this.A03;
                                        if (r10 != null) {
                                            Bitmap A033 = r10.A03(this, A75(), getResources().getDimension(R.dimen.f6nameremoved), getResources().getDimensionPixelSize(R.dimen.f6nameremoved), true);
                                            PhotoView A76 = A76();
                                            A76.A0Y = true;
                                            A76.A08 = 1.0f;
                                            A76.A06(A033);
                                            A74().setImageBitmap(A033);
                                            A7A(getIntent().getBooleanExtra("open_pic_selection_sheet", false));
                                            if (!this.A0C) {
                                                PhotoView A762 = A76();
                                                Drawable A002 = C02680He.A00(getTheme(), getResources(), R.drawable.avatar_newsletter_large);
                                                C162457s7.A0K(A002, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                                                A762.A07((BitmapDrawable) A002);
                                            }
                                            String stringExtra = getIntent().getStringExtra("circular_return_name");
                                            if (stringExtra == null) {
                                                stringExtra = new AnonymousClass5MG(this).A03(R.string.f11nameremoved);
                                            }
                                            C162457s7.A0H(stringExtra);
                                            boolean z = C107275b2.A00;
                                            A77(z, stringExtra);
                                            C106575Zn.A00(C18290x4.A0N(this, R.id.root_view), C18290x4.A0N(this, R.id.content), A28, this, A76(), r9, z);
                                            return;
                                        }
                                        throw C18270x1.A0S("contactPhotosBitmapManager");
                                    }
                                    throw C18270x1.A0S("mediaUI");
                                }
                                throw C18270x1.A0S("mediaStateManager");
                            }
                            throw C18270x1.A0S("waContactNames");
                        }
                        throw C18270x1.A0S("photoUpdateFactory");
                    }
                    throw C18270x1.A0S("contactPhotos");
                }
            } else {
                throw C18270x1.A0S("contactManager");
            }
        }
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Throwable th;
        C162457s7.A0J(menuItem, 0);
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_edit) {
            A79();
            return true;
        } else if (itemId == 1) {
            File A002 = C64393Dh.A00(this.A04, "photo.jpg");
            try {
                C56332ro r1 = this.A06;
                if (r1 != null) {
                    File A003 = r1.A00(A75());
                    if (A003 != null) {
                        C627536m.A0I(new FileInputStream(A003), AnonymousClass0x9.A0h(A002));
                        Uri A012 = C627536m.A01(this, A002);
                        C162457s7.A0D(A012);
                        AnonymousClass30B r0 = this.A03;
                        if (r0 != null) {
                            r0.A02().A08(A012.toString());
                            Intent[] intentArr = new Intent[2];
                            intentArr[0] = AnonymousClass0x9.A09("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", A012);
                            Intent putExtra = C18320x8.A07().setClassName(this, "com.whatsapp.profile.ViewProfilePhoto$SavePhoto").putExtra("android.intent.extra.STREAM", Uri.fromFile(A002));
                            AnonymousClass5ZU r12 = this.A05;
                            if (r12 != null) {
                                Intent A013 = C107395bF.A01((IntentSender) null, (CharSequence) null, AnonymousClass0x9.A19(putExtra.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r12.A0H(A75())), intentArr, 1));
                                C162457s7.A0D(A013);
                                startActivity(A013);
                                return true;
                            }
                            th = C18270x1.A0S("waContactNames");
                        } else {
                            th = C18270x1.A0S("caches");
                        }
                    } else {
                        th = AnonymousClass002.A0C("File cannot be read");
                    }
                } else {
                    th = C18270x1.A0S("contactPhotoHelper");
                }
                throw th;
            } catch (IOException e) {
                Log.e((Throwable) e);
                this.A05.A0H(R.string.f11nameremoved, 1);
                return true;
            }
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            AnonymousClass0X0.A00(this);
            return true;
        }
    }

    public ViewNewsletterProfilePhoto(int i) {
        this.A0D = false;
        C86604Kt.A1K(this, 72);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0F.removeMessages(0);
    }

    public void onResume() {
        super.onResume();
        if (!this.A0E && AnonymousClass0x9.A1N(getIntent(), "open_pic_selection_sheet")) {
            this.A0E = true;
            A79();
        }
    }

    public ViewNewsletterProfilePhoto() {
        this(0);
        this.A0F = new C124726Dq(Looper.getMainLooper(), this);
        this.A09 = C141986wS.UNCHANGED;
    }
}

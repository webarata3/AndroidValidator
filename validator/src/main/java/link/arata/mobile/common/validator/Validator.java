package link.arata.mobile.common.validator;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Validatorインターフェース
 *
 * @author arata
 */
public interface Validator {
    /**
     * バリデーションする
     *
     * @param context コンテキスト
     * @param value   バリデーション対象の文字列
     * @return エラーの場合エラーメッセージを返す。エラーでない場合nullを返す。
     */
    @Nullable
    String validate(@NonNull Context context, @NonNull String value);
}
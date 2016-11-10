package dev.starlai.archi.ui.setting;

/**
 * Created by izayoi on 11/9/2016.
 */

public class SettingsPresenter implements SettingsContract.Actions {
    @Override
    public boolean onPasswordValidation(String password) {
        return false;
    }
}
